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

@Tag("33")
class Record_1482 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1482: FirstName is Rosalie")
	void FirstNameOfRecord1482() {
		assertEquals("Rosalie", customers.get(1481).getFirstName());
	}

	@Test
	@DisplayName("Record 1482: LastName is Gigante")
	void LastNameOfRecord1482() {
		assertEquals("Gigante", customers.get(1481).getLastName());
	}

	@Test
	@DisplayName("Record 1482: Company is Markel Service Inc")
	void CompanyOfRecord1482() {
		assertEquals("Markel Service Inc", customers.get(1481).getCompany());
	}

	@Test
	@DisplayName("Record 1482: Address is 963 Phillips Ave")
	void AddressOfRecord1482() {
		assertEquals("963 Phillips Ave", customers.get(1481).getAddress());
	}

	@Test
	@DisplayName("Record 1482: City is Toledo")
	void CityOfRecord1482() {
		assertEquals("Toledo", customers.get(1481).getCity());
	}

	@Test
	@DisplayName("Record 1482: County is Lucas")
	void CountyOfRecord1482() {
		assertEquals("Lucas", customers.get(1481).getCounty());
	}

	@Test
	@DisplayName("Record 1482: State is OH")
	void StateOfRecord1482() {
		assertEquals("OH", customers.get(1481).getState());
	}

	@Test
	@DisplayName("Record 1482: ZIP is 43612")
	void ZIPOfRecord1482() {
		assertEquals("43612", customers.get(1481).getZIP());
	}

	@Test
	@DisplayName("Record 1482: Phone is 419-470-6295")
	void PhoneOfRecord1482() {
		assertEquals("419-470-6295", customers.get(1481).getPhone());
	}

	@Test
	@DisplayName("Record 1482: Fax is 419-470-9306")
	void FaxOfRecord1482() {
		assertEquals("419-470-9306", customers.get(1481).getFax());
	}

	@Test
	@DisplayName("Record 1482: Email is rosalie@gigante.com")
	void EmailOfRecord1482() {
		assertEquals("rosalie@gigante.com", customers.get(1481).getEmail());
	}

	@Test
	@DisplayName("Record 1482: Web is http://www.rosaliegigante.com")
	void WebOfRecord1482() {
		assertEquals("http://www.rosaliegigante.com", customers.get(1481).getWeb());
	}
}
