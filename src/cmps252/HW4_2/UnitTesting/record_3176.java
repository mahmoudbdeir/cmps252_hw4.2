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
class Record_3176 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3176: FirstName is Germaine")
	void FirstNameOfRecord3176() {
		assertEquals("Germaine", customers.get(3175).getFirstName());
	}

	@Test
	@DisplayName("Record 3176: LastName is Ricciuti")
	void LastNameOfRecord3176() {
		assertEquals("Ricciuti", customers.get(3175).getLastName());
	}

	@Test
	@DisplayName("Record 3176: Company is Polymer Extruded Products Inc")
	void CompanyOfRecord3176() {
		assertEquals("Polymer Extruded Products Inc", customers.get(3175).getCompany());
	}

	@Test
	@DisplayName("Record 3176: Address is 851 Sw 6th Ave  #-1600")
	void AddressOfRecord3176() {
		assertEquals("851 Sw 6th Ave  #-1600", customers.get(3175).getAddress());
	}

	@Test
	@DisplayName("Record 3176: City is Portland")
	void CityOfRecord3176() {
		assertEquals("Portland", customers.get(3175).getCity());
	}

	@Test
	@DisplayName("Record 3176: County is Multnomah")
	void CountyOfRecord3176() {
		assertEquals("Multnomah", customers.get(3175).getCounty());
	}

	@Test
	@DisplayName("Record 3176: State is OR")
	void StateOfRecord3176() {
		assertEquals("OR", customers.get(3175).getState());
	}

	@Test
	@DisplayName("Record 3176: ZIP is 97204")
	void ZIPOfRecord3176() {
		assertEquals("97204", customers.get(3175).getZIP());
	}

	@Test
	@DisplayName("Record 3176: Phone is 503-248-6965")
	void PhoneOfRecord3176() {
		assertEquals("503-248-6965", customers.get(3175).getPhone());
	}

	@Test
	@DisplayName("Record 3176: Fax is 503-248-4509")
	void FaxOfRecord3176() {
		assertEquals("503-248-4509", customers.get(3175).getFax());
	}

	@Test
	@DisplayName("Record 3176: Email is germaine@ricciuti.com")
	void EmailOfRecord3176() {
		assertEquals("germaine@ricciuti.com", customers.get(3175).getEmail());
	}

	@Test
	@DisplayName("Record 3176: Web is http://www.germainericciuti.com")
	void WebOfRecord3176() {
		assertEquals("http://www.germainericciuti.com", customers.get(3175).getWeb());
	}
}
