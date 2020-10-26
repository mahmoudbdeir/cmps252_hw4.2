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

@Tag("10")
class Record_4743 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4743: FirstName is Jay")
	void FirstNameOfRecord4743() {
		assertEquals("Jay", customers.get(4742).getFirstName());
	}

	@Test
	@DisplayName("Record 4743: LastName is Hanten")
	void LastNameOfRecord4743() {
		assertEquals("Hanten", customers.get(4742).getLastName());
	}

	@Test
	@DisplayName("Record 4743: Company is Allendale Automotive Ent")
	void CompanyOfRecord4743() {
		assertEquals("Allendale Automotive Ent", customers.get(4742).getCompany());
	}

	@Test
	@DisplayName("Record 4743: Address is 17400 Sw Brookman Rd")
	void AddressOfRecord4743() {
		assertEquals("17400 Sw Brookman Rd", customers.get(4742).getAddress());
	}

	@Test
	@DisplayName("Record 4743: City is Sherwood")
	void CityOfRecord4743() {
		assertEquals("Sherwood", customers.get(4742).getCity());
	}

	@Test
	@DisplayName("Record 4743: County is Washington")
	void CountyOfRecord4743() {
		assertEquals("Washington", customers.get(4742).getCounty());
	}

	@Test
	@DisplayName("Record 4743: State is OR")
	void StateOfRecord4743() {
		assertEquals("OR", customers.get(4742).getState());
	}

	@Test
	@DisplayName("Record 4743: ZIP is 97140")
	void ZIPOfRecord4743() {
		assertEquals("97140", customers.get(4742).getZIP());
	}

	@Test
	@DisplayName("Record 4743: Phone is 503-625-0329")
	void PhoneOfRecord4743() {
		assertEquals("503-625-0329", customers.get(4742).getPhone());
	}

	@Test
	@DisplayName("Record 4743: Fax is 503-625-7025")
	void FaxOfRecord4743() {
		assertEquals("503-625-7025", customers.get(4742).getFax());
	}

	@Test
	@DisplayName("Record 4743: Email is jay@hanten.com")
	void EmailOfRecord4743() {
		assertEquals("jay@hanten.com", customers.get(4742).getEmail());
	}

	@Test
	@DisplayName("Record 4743: Web is http://www.jayhanten.com")
	void WebOfRecord4743() {
		assertEquals("http://www.jayhanten.com", customers.get(4742).getWeb());
	}
}
