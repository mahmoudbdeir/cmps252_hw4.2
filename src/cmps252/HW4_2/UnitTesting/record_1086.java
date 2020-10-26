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

@Tag("27")
class Record_1086 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1086: FirstName is Kristofer")
	void FirstNameOfRecord1086() {
		assertEquals("Kristofer", customers.get(1085).getFirstName());
	}

	@Test
	@DisplayName("Record 1086: LastName is Eustache")
	void LastNameOfRecord1086() {
		assertEquals("Eustache", customers.get(1085).getLastName());
	}

	@Test
	@DisplayName("Record 1086: Company is Inovent Limited")
	void CompanyOfRecord1086() {
		assertEquals("Inovent Limited", customers.get(1085).getCompany());
	}

	@Test
	@DisplayName("Record 1086: Address is 1601 S Beavercreek Rd")
	void AddressOfRecord1086() {
		assertEquals("1601 S Beavercreek Rd", customers.get(1085).getAddress());
	}

	@Test
	@DisplayName("Record 1086: City is West Linn")
	void CityOfRecord1086() {
		assertEquals("West Linn", customers.get(1085).getCity());
	}

	@Test
	@DisplayName("Record 1086: County is Clackamas")
	void CountyOfRecord1086() {
		assertEquals("Clackamas", customers.get(1085).getCounty());
	}

	@Test
	@DisplayName("Record 1086: State is OR")
	void StateOfRecord1086() {
		assertEquals("OR", customers.get(1085).getState());
	}

	@Test
	@DisplayName("Record 1086: ZIP is 97068")
	void ZIPOfRecord1086() {
		assertEquals("97068", customers.get(1085).getZIP());
	}

	@Test
	@DisplayName("Record 1086: Phone is 503-656-5086")
	void PhoneOfRecord1086() {
		assertEquals("503-656-5086", customers.get(1085).getPhone());
	}

	@Test
	@DisplayName("Record 1086: Fax is 503-656-8385")
	void FaxOfRecord1086() {
		assertEquals("503-656-8385", customers.get(1085).getFax());
	}

	@Test
	@DisplayName("Record 1086: Email is kristofer@eustache.com")
	void EmailOfRecord1086() {
		assertEquals("kristofer@eustache.com", customers.get(1085).getEmail());
	}

	@Test
	@DisplayName("Record 1086: Web is http://www.kristofereustache.com")
	void WebOfRecord1086() {
		assertEquals("http://www.kristofereustache.com", customers.get(1085).getWeb());
	}
}
