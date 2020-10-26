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

@Tag("43")
class Record_2388 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2388: FirstName is Pasquale")
	void FirstNameOfRecord2388() {
		assertEquals("Pasquale", customers.get(2387).getFirstName());
	}

	@Test
	@DisplayName("Record 2388: LastName is Balli")
	void LastNameOfRecord2388() {
		assertEquals("Balli", customers.get(2387).getLastName());
	}

	@Test
	@DisplayName("Record 2388: Company is Harrington Ind Plast Inc")
	void CompanyOfRecord2388() {
		assertEquals("Harrington Ind Plast Inc", customers.get(2387).getCompany());
	}

	@Test
	@DisplayName("Record 2388: Address is 457 Taylor Ave")
	void AddressOfRecord2388() {
		assertEquals("457 Taylor Ave", customers.get(2387).getAddress());
	}

	@Test
	@DisplayName("Record 2388: City is Vineland")
	void CityOfRecord2388() {
		assertEquals("Vineland", customers.get(2387).getCity());
	}

	@Test
	@DisplayName("Record 2388: County is Cumberland")
	void CountyOfRecord2388() {
		assertEquals("Cumberland", customers.get(2387).getCounty());
	}

	@Test
	@DisplayName("Record 2388: State is NJ")
	void StateOfRecord2388() {
		assertEquals("NJ", customers.get(2387).getState());
	}

	@Test
	@DisplayName("Record 2388: ZIP is 8360")
	void ZIPOfRecord2388() {
		assertEquals("8360", customers.get(2387).getZIP());
	}

	@Test
	@DisplayName("Record 2388: Phone is 856-691-9313")
	void PhoneOfRecord2388() {
		assertEquals("856-691-9313", customers.get(2387).getPhone());
	}

	@Test
	@DisplayName("Record 2388: Fax is 856-691-4697")
	void FaxOfRecord2388() {
		assertEquals("856-691-4697", customers.get(2387).getFax());
	}

	@Test
	@DisplayName("Record 2388: Email is pasquale@balli.com")
	void EmailOfRecord2388() {
		assertEquals("pasquale@balli.com", customers.get(2387).getEmail());
	}

	@Test
	@DisplayName("Record 2388: Web is http://www.pasqualeballi.com")
	void WebOfRecord2388() {
		assertEquals("http://www.pasqualeballi.com", customers.get(2387).getWeb());
	}
}
