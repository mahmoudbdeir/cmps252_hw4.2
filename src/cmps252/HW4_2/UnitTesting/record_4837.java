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

@Tag("46")
class Record_4837 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4837: FirstName is Phillip")
	void FirstNameOfRecord4837() {
		assertEquals("Phillip", customers.get(4836).getFirstName());
	}

	@Test
	@DisplayName("Record 4837: LastName is Koewler")
	void LastNameOfRecord4837() {
		assertEquals("Koewler", customers.get(4836).getLastName());
	}

	@Test
	@DisplayName("Record 4837: Company is Untd States Ind Tool & Supl Co")
	void CompanyOfRecord4837() {
		assertEquals("Untd States Ind Tool & Supl Co", customers.get(4836).getCompany());
	}

	@Test
	@DisplayName("Record 4837: Address is 2688 S La Cienega Blvd")
	void AddressOfRecord4837() {
		assertEquals("2688 S La Cienega Blvd", customers.get(4836).getAddress());
	}

	@Test
	@DisplayName("Record 4837: City is Los Angeles")
	void CityOfRecord4837() {
		assertEquals("Los Angeles", customers.get(4836).getCity());
	}

	@Test
	@DisplayName("Record 4837: County is Los Angeles")
	void CountyOfRecord4837() {
		assertEquals("Los Angeles", customers.get(4836).getCounty());
	}

	@Test
	@DisplayName("Record 4837: State is CA")
	void StateOfRecord4837() {
		assertEquals("CA", customers.get(4836).getState());
	}

	@Test
	@DisplayName("Record 4837: ZIP is 90034")
	void ZIPOfRecord4837() {
		assertEquals("90034", customers.get(4836).getZIP());
	}

	@Test
	@DisplayName("Record 4837: Phone is 310-858-6391")
	void PhoneOfRecord4837() {
		assertEquals("310-858-6391", customers.get(4836).getPhone());
	}

	@Test
	@DisplayName("Record 4837: Fax is 310-858-8165")
	void FaxOfRecord4837() {
		assertEquals("310-858-8165", customers.get(4836).getFax());
	}

	@Test
	@DisplayName("Record 4837: Email is phillip@koewler.com")
	void EmailOfRecord4837() {
		assertEquals("phillip@koewler.com", customers.get(4836).getEmail());
	}

	@Test
	@DisplayName("Record 4837: Web is http://www.phillipkoewler.com")
	void WebOfRecord4837() {
		assertEquals("http://www.phillipkoewler.com", customers.get(4836).getWeb());
	}
}
