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

@Tag("2")
class Record_1523 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1523: FirstName is Randolph")
	void FirstNameOfRecord1523() {
		assertEquals("Randolph", customers.get(1522).getFirstName());
	}

	@Test
	@DisplayName("Record 1523: LastName is Slaney")
	void LastNameOfRecord1523() {
		assertEquals("Slaney", customers.get(1522).getLastName());
	}

	@Test
	@DisplayName("Record 1523: Company is Tulip Time Information")
	void CompanyOfRecord1523() {
		assertEquals("Tulip Time Information", customers.get(1522).getCompany());
	}

	@Test
	@DisplayName("Record 1523: Address is 770 W Hampden Ave  #-250")
	void AddressOfRecord1523() {
		assertEquals("770 W Hampden Ave  #-250", customers.get(1522).getAddress());
	}

	@Test
	@DisplayName("Record 1523: City is Englewood")
	void CityOfRecord1523() {
		assertEquals("Englewood", customers.get(1522).getCity());
	}

	@Test
	@DisplayName("Record 1523: County is Arapahoe")
	void CountyOfRecord1523() {
		assertEquals("Arapahoe", customers.get(1522).getCounty());
	}

	@Test
	@DisplayName("Record 1523: State is CO")
	void StateOfRecord1523() {
		assertEquals("CO", customers.get(1522).getState());
	}

	@Test
	@DisplayName("Record 1523: ZIP is 80110")
	void ZIPOfRecord1523() {
		assertEquals("80110", customers.get(1522).getZIP());
	}

	@Test
	@DisplayName("Record 1523: Phone is 303-761-8898")
	void PhoneOfRecord1523() {
		assertEquals("303-761-8898", customers.get(1522).getPhone());
	}

	@Test
	@DisplayName("Record 1523: Fax is 303-761-2643")
	void FaxOfRecord1523() {
		assertEquals("303-761-2643", customers.get(1522).getFax());
	}

	@Test
	@DisplayName("Record 1523: Email is randolph@slaney.com")
	void EmailOfRecord1523() {
		assertEquals("randolph@slaney.com", customers.get(1522).getEmail());
	}

	@Test
	@DisplayName("Record 1523: Web is http://www.randolphslaney.com")
	void WebOfRecord1523() {
		assertEquals("http://www.randolphslaney.com", customers.get(1522).getWeb());
	}
}
