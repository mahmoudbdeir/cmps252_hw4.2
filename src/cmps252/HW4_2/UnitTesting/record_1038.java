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

@Tag("41")
class Record_1038 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1038: FirstName is Franklyn")
	void FirstNameOfRecord1038() {
		assertEquals("Franklyn", customers.get(1037).getFirstName());
	}

	@Test
	@DisplayName("Record 1038: LastName is Niedzwiecki")
	void LastNameOfRecord1038() {
		assertEquals("Niedzwiecki", customers.get(1037).getLastName());
	}

	@Test
	@DisplayName("Record 1038: Company is Richmond Heating Plbg & Contr")
	void CompanyOfRecord1038() {
		assertEquals("Richmond Heating Plbg & Contr", customers.get(1037).getCompany());
	}

	@Test
	@DisplayName("Record 1038: Address is 5100 W Charleston Blvd")
	void AddressOfRecord1038() {
		assertEquals("5100 W Charleston Blvd", customers.get(1037).getAddress());
	}

	@Test
	@DisplayName("Record 1038: City is Las Vegas")
	void CityOfRecord1038() {
		assertEquals("Las Vegas", customers.get(1037).getCity());
	}

	@Test
	@DisplayName("Record 1038: County is Clark")
	void CountyOfRecord1038() {
		assertEquals("Clark", customers.get(1037).getCounty());
	}

	@Test
	@DisplayName("Record 1038: State is NV")
	void StateOfRecord1038() {
		assertEquals("NV", customers.get(1037).getState());
	}

	@Test
	@DisplayName("Record 1038: ZIP is 89102")
	void ZIPOfRecord1038() {
		assertEquals("89102", customers.get(1037).getZIP());
	}

	@Test
	@DisplayName("Record 1038: Phone is 702-877-4062")
	void PhoneOfRecord1038() {
		assertEquals("702-877-4062", customers.get(1037).getPhone());
	}

	@Test
	@DisplayName("Record 1038: Fax is 702-877-0609")
	void FaxOfRecord1038() {
		assertEquals("702-877-0609", customers.get(1037).getFax());
	}

	@Test
	@DisplayName("Record 1038: Email is franklyn@niedzwiecki.com")
	void EmailOfRecord1038() {
		assertEquals("franklyn@niedzwiecki.com", customers.get(1037).getEmail());
	}

	@Test
	@DisplayName("Record 1038: Web is http://www.franklynniedzwiecki.com")
	void WebOfRecord1038() {
		assertEquals("http://www.franklynniedzwiecki.com", customers.get(1037).getWeb());
	}
}
