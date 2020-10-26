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
class Record_118 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 118: FirstName is Faye")
	void FirstNameOfRecord118() {
		assertEquals("Faye", customers.get(117).getFirstName());
	}

	@Test
	@DisplayName("Record 118: LastName is Rockefeller")
	void LastNameOfRecord118() {
		assertEquals("Rockefeller", customers.get(117).getLastName());
	}

	@Test
	@DisplayName("Record 118: Company is Northwood Door")
	void CompanyOfRecord118() {
		assertEquals("Northwood Door", customers.get(117).getCompany());
	}

	@Test
	@DisplayName("Record 118: Address is Highway 65s S")
	void AddressOfRecord118() {
		assertEquals("Highway 65s S", customers.get(117).getAddress());
	}

	@Test
	@DisplayName("Record 118: City is Conway")
	void CityOfRecord118() {
		assertEquals("Conway", customers.get(117).getCity());
	}

	@Test
	@DisplayName("Record 118: County is Faulkner")
	void CountyOfRecord118() {
		assertEquals("Faulkner", customers.get(117).getCounty());
	}

	@Test
	@DisplayName("Record 118: State is AR")
	void StateOfRecord118() {
		assertEquals("AR", customers.get(117).getState());
	}

	@Test
	@DisplayName("Record 118: ZIP is 72032")
	void ZIPOfRecord118() {
		assertEquals("72032", customers.get(117).getZIP());
	}

	@Test
	@DisplayName("Record 118: Phone is 501-329-3765")
	void PhoneOfRecord118() {
		assertEquals("501-329-3765", customers.get(117).getPhone());
	}

	@Test
	@DisplayName("Record 118: Fax is 501-329-4683")
	void FaxOfRecord118() {
		assertEquals("501-329-4683", customers.get(117).getFax());
	}

	@Test
	@DisplayName("Record 118: Email is faye@rockefeller.com")
	void EmailOfRecord118() {
		assertEquals("faye@rockefeller.com", customers.get(117).getEmail());
	}

	@Test
	@DisplayName("Record 118: Web is http://www.fayerockefeller.com")
	void WebOfRecord118() {
		assertEquals("http://www.fayerockefeller.com", customers.get(117).getWeb());
	}
}
