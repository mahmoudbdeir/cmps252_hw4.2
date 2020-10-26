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

@Tag("20")
class Record_4179 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4179: FirstName is Caryn")
	void FirstNameOfRecord4179() {
		assertEquals("Caryn", customers.get(4178).getFirstName());
	}

	@Test
	@DisplayName("Record 4179: LastName is Endreson")
	void LastNameOfRecord4179() {
		assertEquals("Endreson", customers.get(4178).getLastName());
	}

	@Test
	@DisplayName("Record 4179: Company is National Crane & Cmpnts Inc")
	void CompanyOfRecord4179() {
		assertEquals("National Crane & Cmpnts Inc", customers.get(4178).getCompany());
	}

	@Test
	@DisplayName("Record 4179: Address is 29 E West Jersey Ave")
	void AddressOfRecord4179() {
		assertEquals("29 E West Jersey Ave", customers.get(4178).getAddress());
	}

	@Test
	@DisplayName("Record 4179: City is Pleasantville")
	void CityOfRecord4179() {
		assertEquals("Pleasantville", customers.get(4178).getCity());
	}

	@Test
	@DisplayName("Record 4179: County is Atlantic")
	void CountyOfRecord4179() {
		assertEquals("Atlantic", customers.get(4178).getCounty());
	}

	@Test
	@DisplayName("Record 4179: State is NJ")
	void StateOfRecord4179() {
		assertEquals("NJ", customers.get(4178).getState());
	}

	@Test
	@DisplayName("Record 4179: ZIP is 8232")
	void ZIPOfRecord4179() {
		assertEquals("8232", customers.get(4178).getZIP());
	}

	@Test
	@DisplayName("Record 4179: Phone is 609-383-0159")
	void PhoneOfRecord4179() {
		assertEquals("609-383-0159", customers.get(4178).getPhone());
	}

	@Test
	@DisplayName("Record 4179: Fax is 609-383-6506")
	void FaxOfRecord4179() {
		assertEquals("609-383-6506", customers.get(4178).getFax());
	}

	@Test
	@DisplayName("Record 4179: Email is caryn@endreson.com")
	void EmailOfRecord4179() {
		assertEquals("caryn@endreson.com", customers.get(4178).getEmail());
	}

	@Test
	@DisplayName("Record 4179: Web is http://www.carynendreson.com")
	void WebOfRecord4179() {
		assertEquals("http://www.carynendreson.com", customers.get(4178).getWeb());
	}
}
