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

@Tag("25")
class Record_4768 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4768: FirstName is Moses")
	void FirstNameOfRecord4768() {
		assertEquals("Moses", customers.get(4767).getFirstName());
	}

	@Test
	@DisplayName("Record 4768: LastName is Gelber")
	void LastNameOfRecord4768() {
		assertEquals("Gelber", customers.get(4767).getLastName());
	}

	@Test
	@DisplayName("Record 4768: Company is Red Deer Construction Inc")
	void CompanyOfRecord4768() {
		assertEquals("Red Deer Construction Inc", customers.get(4767).getCompany());
	}

	@Test
	@DisplayName("Record 4768: Address is 3910 Center Rd")
	void AddressOfRecord4768() {
		assertEquals("3910 Center Rd", customers.get(4767).getAddress());
	}

	@Test
	@DisplayName("Record 4768: City is Highland")
	void CityOfRecord4768() {
		assertEquals("Highland", customers.get(4767).getCity());
	}

	@Test
	@DisplayName("Record 4768: County is Oakland")
	void CountyOfRecord4768() {
		assertEquals("Oakland", customers.get(4767).getCounty());
	}

	@Test
	@DisplayName("Record 4768: State is MI")
	void StateOfRecord4768() {
		assertEquals("MI", customers.get(4767).getState());
	}

	@Test
	@DisplayName("Record 4768: ZIP is 48357")
	void ZIPOfRecord4768() {
		assertEquals("48357", customers.get(4767).getZIP());
	}

	@Test
	@DisplayName("Record 4768: Phone is 248-887-1379")
	void PhoneOfRecord4768() {
		assertEquals("248-887-1379", customers.get(4767).getPhone());
	}

	@Test
	@DisplayName("Record 4768: Fax is 248-887-6489")
	void FaxOfRecord4768() {
		assertEquals("248-887-6489", customers.get(4767).getFax());
	}

	@Test
	@DisplayName("Record 4768: Email is moses@gelber.com")
	void EmailOfRecord4768() {
		assertEquals("moses@gelber.com", customers.get(4767).getEmail());
	}

	@Test
	@DisplayName("Record 4768: Web is http://www.mosesgelber.com")
	void WebOfRecord4768() {
		assertEquals("http://www.mosesgelber.com", customers.get(4767).getWeb());
	}
}
