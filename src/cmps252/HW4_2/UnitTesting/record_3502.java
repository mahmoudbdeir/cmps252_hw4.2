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

@Tag("36")
class Record_3502 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3502: FirstName is Augustus")
	void FirstNameOfRecord3502() {
		assertEquals("Augustus", customers.get(3501).getFirstName());
	}

	@Test
	@DisplayName("Record 3502: LastName is Volbert")
	void LastNameOfRecord3502() {
		assertEquals("Volbert", customers.get(3501).getLastName());
	}

	@Test
	@DisplayName("Record 3502: Company is Bpi Jackson")
	void CompanyOfRecord3502() {
		assertEquals("Bpi Jackson", customers.get(3501).getCompany());
	}

	@Test
	@DisplayName("Record 3502: Address is 429 N State St")
	void AddressOfRecord3502() {
		assertEquals("429 N State St", customers.get(3501).getAddress());
	}

	@Test
	@DisplayName("Record 3502: City is Caro")
	void CityOfRecord3502() {
		assertEquals("Caro", customers.get(3501).getCity());
	}

	@Test
	@DisplayName("Record 3502: County is Tuscola")
	void CountyOfRecord3502() {
		assertEquals("Tuscola", customers.get(3501).getCounty());
	}

	@Test
	@DisplayName("Record 3502: State is MI")
	void StateOfRecord3502() {
		assertEquals("MI", customers.get(3501).getState());
	}

	@Test
	@DisplayName("Record 3502: ZIP is 48723")
	void ZIPOfRecord3502() {
		assertEquals("48723", customers.get(3501).getZIP());
	}

	@Test
	@DisplayName("Record 3502: Phone is 989-673-0851")
	void PhoneOfRecord3502() {
		assertEquals("989-673-0851", customers.get(3501).getPhone());
	}

	@Test
	@DisplayName("Record 3502: Fax is 989-673-4612")
	void FaxOfRecord3502() {
		assertEquals("989-673-4612", customers.get(3501).getFax());
	}

	@Test
	@DisplayName("Record 3502: Email is augustus@volbert.com")
	void EmailOfRecord3502() {
		assertEquals("augustus@volbert.com", customers.get(3501).getEmail());
	}

	@Test
	@DisplayName("Record 3502: Web is http://www.augustusvolbert.com")
	void WebOfRecord3502() {
		assertEquals("http://www.augustusvolbert.com", customers.get(3501).getWeb());
	}
}
