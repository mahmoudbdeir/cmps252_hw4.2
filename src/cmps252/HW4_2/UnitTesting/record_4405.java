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

@Tag("39")
class Record_4405 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4405: FirstName is Larissa")
	void FirstNameOfRecord4405() {
		assertEquals("Larissa", customers.get(4404).getFirstName());
	}

	@Test
	@DisplayName("Record 4405: LastName is Nichol")
	void LastNameOfRecord4405() {
		assertEquals("Nichol", customers.get(4404).getLastName());
	}

	@Test
	@DisplayName("Record 4405: Company is Sigma Data")
	void CompanyOfRecord4405() {
		assertEquals("Sigma Data", customers.get(4404).getCompany());
	}

	@Test
	@DisplayName("Record 4405: Address is 10245 Main St")
	void AddressOfRecord4405() {
		assertEquals("10245 Main St", customers.get(4404).getAddress());
	}

	@Test
	@DisplayName("Record 4405: City is Bellevue")
	void CityOfRecord4405() {
		assertEquals("Bellevue", customers.get(4404).getCity());
	}

	@Test
	@DisplayName("Record 4405: County is King")
	void CountyOfRecord4405() {
		assertEquals("King", customers.get(4404).getCounty());
	}

	@Test
	@DisplayName("Record 4405: State is WA")
	void StateOfRecord4405() {
		assertEquals("WA", customers.get(4404).getState());
	}

	@Test
	@DisplayName("Record 4405: ZIP is 98004")
	void ZIPOfRecord4405() {
		assertEquals("98004", customers.get(4404).getZIP());
	}

	@Test
	@DisplayName("Record 4405: Phone is 425-455-5951")
	void PhoneOfRecord4405() {
		assertEquals("425-455-5951", customers.get(4404).getPhone());
	}

	@Test
	@DisplayName("Record 4405: Fax is 425-455-3889")
	void FaxOfRecord4405() {
		assertEquals("425-455-3889", customers.get(4404).getFax());
	}

	@Test
	@DisplayName("Record 4405: Email is larissa@nichol.com")
	void EmailOfRecord4405() {
		assertEquals("larissa@nichol.com", customers.get(4404).getEmail());
	}

	@Test
	@DisplayName("Record 4405: Web is http://www.larissanichol.com")
	void WebOfRecord4405() {
		assertEquals("http://www.larissanichol.com", customers.get(4404).getWeb());
	}
}
