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
class Record_3520 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3520: FirstName is Chase")
	void FirstNameOfRecord3520() {
		assertEquals("Chase", customers.get(3519).getFirstName());
	}

	@Test
	@DisplayName("Record 3520: LastName is Bowan")
	void LastNameOfRecord3520() {
		assertEquals("Bowan", customers.get(3519).getLastName());
	}

	@Test
	@DisplayName("Record 3520: Company is Employers Overload")
	void CompanyOfRecord3520() {
		assertEquals("Employers Overload", customers.get(3519).getCompany());
	}

	@Test
	@DisplayName("Record 3520: Address is 201 S Biscayne Blvd")
	void AddressOfRecord3520() {
		assertEquals("201 S Biscayne Blvd", customers.get(3519).getAddress());
	}

	@Test
	@DisplayName("Record 3520: City is Miami")
	void CityOfRecord3520() {
		assertEquals("Miami", customers.get(3519).getCity());
	}

	@Test
	@DisplayName("Record 3520: County is Miami-Dade")
	void CountyOfRecord3520() {
		assertEquals("Miami-Dade", customers.get(3519).getCounty());
	}

	@Test
	@DisplayName("Record 3520: State is FL")
	void StateOfRecord3520() {
		assertEquals("FL", customers.get(3519).getState());
	}

	@Test
	@DisplayName("Record 3520: ZIP is 33131")
	void ZIPOfRecord3520() {
		assertEquals("33131", customers.get(3519).getZIP());
	}

	@Test
	@DisplayName("Record 3520: Phone is 305-379-4881")
	void PhoneOfRecord3520() {
		assertEquals("305-379-4881", customers.get(3519).getPhone());
	}

	@Test
	@DisplayName("Record 3520: Fax is 305-379-3401")
	void FaxOfRecord3520() {
		assertEquals("305-379-3401", customers.get(3519).getFax());
	}

	@Test
	@DisplayName("Record 3520: Email is chase@bowan.com")
	void EmailOfRecord3520() {
		assertEquals("chase@bowan.com", customers.get(3519).getEmail());
	}

	@Test
	@DisplayName("Record 3520: Web is http://www.chasebowan.com")
	void WebOfRecord3520() {
		assertEquals("http://www.chasebowan.com", customers.get(3519).getWeb());
	}
}
