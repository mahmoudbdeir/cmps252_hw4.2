package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("20")
class Record_4531 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4531: FirstName is Don")
	void FirstNameOfRecord4531() {
		assertEquals("Don", customers.get(4530).getFirstName());
	}

	@Test
	@DisplayName("Record 4531: LastName is Trites")
	void LastNameOfRecord4531() {
		assertEquals("Trites", customers.get(4530).getLastName());
	}

	@Test
	@DisplayName("Record 4531: Company is Novotel Htl Meadowlands")
	void CompanyOfRecord4531() {
		assertEquals("Novotel Htl Meadowlands", customers.get(4530).getCompany());
	}

	@Test
	@DisplayName("Record 4531: Address is 6705 Juniper Dr")
	void AddressOfRecord4531() {
		assertEquals("6705 Juniper Dr", customers.get(4530).getAddress());
	}

	@Test
	@DisplayName("Record 4531: City is Missoula")
	void CityOfRecord4531() {
		assertEquals("Missoula", customers.get(4530).getCity());
	}

	@Test
	@DisplayName("Record 4531: County is Missoula")
	void CountyOfRecord4531() {
		assertEquals("Missoula", customers.get(4530).getCounty());
	}

	@Test
	@DisplayName("Record 4531: State is MT")
	void StateOfRecord4531() {
		assertEquals("MT", customers.get(4530).getState());
	}

	@Test
	@DisplayName("Record 4531: ZIP is 59802")
	void ZIPOfRecord4531() {
		assertEquals("59802", customers.get(4530).getZIP());
	}

	@Test
	@DisplayName("Record 4531: Phone is 406-258-6905")
	void PhoneOfRecord4531() {
		assertEquals("406-258-6905", customers.get(4530).getPhone());
	}

	@Test
	@DisplayName("Record 4531: Fax is 406-258-4771")
	void FaxOfRecord4531() {
		assertEquals("406-258-4771", customers.get(4530).getFax());
	}

	@Test
	@DisplayName("Record 4531: Email is don@trites.com")
	void EmailOfRecord4531() {
		assertEquals("don@trites.com", customers.get(4530).getEmail());
	}

	@Test
	@DisplayName("Record 4531: Web is http://www.dontrites.com")
	void WebOfRecord4531() {
		assertEquals("http://www.dontrites.com", customers.get(4530).getWeb());
	}
}
