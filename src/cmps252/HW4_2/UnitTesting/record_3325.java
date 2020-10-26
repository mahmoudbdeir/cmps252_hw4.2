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

@Tag("40")
class Record_3325 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3325: FirstName is Winford")
	void FirstNameOfRecord3325() {
		assertEquals("Winford", customers.get(3324).getFirstName());
	}

	@Test
	@DisplayName("Record 3325: LastName is Paxson")
	void LastNameOfRecord3325() {
		assertEquals("Paxson", customers.get(3324).getLastName());
	}

	@Test
	@DisplayName("Record 3325: Company is Sanford Wood Marine Inc")
	void CompanyOfRecord3325() {
		assertEquals("Sanford Wood Marine Inc", customers.get(3324).getCompany());
	}

	@Test
	@DisplayName("Record 3325: Address is 6051 N Fresno St  #-200")
	void AddressOfRecord3325() {
		assertEquals("6051 N Fresno St  #-200", customers.get(3324).getAddress());
	}

	@Test
	@DisplayName("Record 3325: City is Fresno")
	void CityOfRecord3325() {
		assertEquals("Fresno", customers.get(3324).getCity());
	}

	@Test
	@DisplayName("Record 3325: County is Fresno")
	void CountyOfRecord3325() {
		assertEquals("Fresno", customers.get(3324).getCounty());
	}

	@Test
	@DisplayName("Record 3325: State is CA")
	void StateOfRecord3325() {
		assertEquals("CA", customers.get(3324).getState());
	}

	@Test
	@DisplayName("Record 3325: ZIP is 93710")
	void ZIPOfRecord3325() {
		assertEquals("93710", customers.get(3324).getZIP());
	}

	@Test
	@DisplayName("Record 3325: Phone is 559-432-7893")
	void PhoneOfRecord3325() {
		assertEquals("559-432-7893", customers.get(3324).getPhone());
	}

	@Test
	@DisplayName("Record 3325: Fax is 559-432-8592")
	void FaxOfRecord3325() {
		assertEquals("559-432-8592", customers.get(3324).getFax());
	}

	@Test
	@DisplayName("Record 3325: Email is winford@paxson.com")
	void EmailOfRecord3325() {
		assertEquals("winford@paxson.com", customers.get(3324).getEmail());
	}

	@Test
	@DisplayName("Record 3325: Web is http://www.winfordpaxson.com")
	void WebOfRecord3325() {
		assertEquals("http://www.winfordpaxson.com", customers.get(3324).getWeb());
	}
}
