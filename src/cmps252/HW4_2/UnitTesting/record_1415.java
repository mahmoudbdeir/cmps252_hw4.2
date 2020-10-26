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

@Tag("3")
class Record_1415 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1415: FirstName is Andrew")
	void FirstNameOfRecord1415() {
		assertEquals("Andrew", customers.get(1414).getFirstName());
	}

	@Test
	@DisplayName("Record 1415: LastName is Labs")
	void LastNameOfRecord1415() {
		assertEquals("Labs", customers.get(1414).getLastName());
	}

	@Test
	@DisplayName("Record 1415: Company is Bierworth & Bierworth Builders")
	void CompanyOfRecord1415() {
		assertEquals("Bierworth & Bierworth Builders", customers.get(1414).getCompany());
	}

	@Test
	@DisplayName("Record 1415: Address is 71 S Hartford Tnpk")
	void AddressOfRecord1415() {
		assertEquals("71 S Hartford Tnpk", customers.get(1414).getAddress());
	}

	@Test
	@DisplayName("Record 1415: City is Wallingford")
	void CityOfRecord1415() {
		assertEquals("Wallingford", customers.get(1414).getCity());
	}

	@Test
	@DisplayName("Record 1415: County is New Haven")
	void CountyOfRecord1415() {
		assertEquals("New Haven", customers.get(1414).getCounty());
	}

	@Test
	@DisplayName("Record 1415: State is CT")
	void StateOfRecord1415() {
		assertEquals("CT", customers.get(1414).getState());
	}

	@Test
	@DisplayName("Record 1415: ZIP is 6492")
	void ZIPOfRecord1415() {
		assertEquals("6492", customers.get(1414).getZIP());
	}

	@Test
	@DisplayName("Record 1415: Phone is 203-265-0032")
	void PhoneOfRecord1415() {
		assertEquals("203-265-0032", customers.get(1414).getPhone());
	}

	@Test
	@DisplayName("Record 1415: Fax is 203-265-8469")
	void FaxOfRecord1415() {
		assertEquals("203-265-8469", customers.get(1414).getFax());
	}

	@Test
	@DisplayName("Record 1415: Email is andrew@labs.com")
	void EmailOfRecord1415() {
		assertEquals("andrew@labs.com", customers.get(1414).getEmail());
	}

	@Test
	@DisplayName("Record 1415: Web is http://www.andrewlabs.com")
	void WebOfRecord1415() {
		assertEquals("http://www.andrewlabs.com", customers.get(1414).getWeb());
	}
}
