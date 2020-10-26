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

@Tag("19")
class Record_4314 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4314: FirstName is Steven")
	void FirstNameOfRecord4314() {
		assertEquals("Steven", customers.get(4313).getFirstName());
	}

	@Test
	@DisplayName("Record 4314: LastName is Adamaitis")
	void LastNameOfRecord4314() {
		assertEquals("Adamaitis", customers.get(4313).getLastName());
	}

	@Test
	@DisplayName("Record 4314: Company is Yardley Consulting")
	void CompanyOfRecord4314() {
		assertEquals("Yardley Consulting", customers.get(4313).getCompany());
	}

	@Test
	@DisplayName("Record 4314: Address is 1875 Connecticut Ave Nw  #-12")
	void AddressOfRecord4314() {
		assertEquals("1875 Connecticut Ave Nw  #-12", customers.get(4313).getAddress());
	}

	@Test
	@DisplayName("Record 4314: City is Washington")
	void CityOfRecord4314() {
		assertEquals("Washington", customers.get(4313).getCity());
	}

	@Test
	@DisplayName("Record 4314: County is District of Columbia")
	void CountyOfRecord4314() {
		assertEquals("District of Columbia", customers.get(4313).getCounty());
	}

	@Test
	@DisplayName("Record 4314: State is DC")
	void StateOfRecord4314() {
		assertEquals("DC", customers.get(4313).getState());
	}

	@Test
	@DisplayName("Record 4314: ZIP is 20009")
	void ZIPOfRecord4314() {
		assertEquals("20009", customers.get(4313).getZIP());
	}

	@Test
	@DisplayName("Record 4314: Phone is 202-986-8792")
	void PhoneOfRecord4314() {
		assertEquals("202-986-8792", customers.get(4313).getPhone());
	}

	@Test
	@DisplayName("Record 4314: Fax is 202-986-3243")
	void FaxOfRecord4314() {
		assertEquals("202-986-3243", customers.get(4313).getFax());
	}

	@Test
	@DisplayName("Record 4314: Email is steven@adamaitis.com")
	void EmailOfRecord4314() {
		assertEquals("steven@adamaitis.com", customers.get(4313).getEmail());
	}

	@Test
	@DisplayName("Record 4314: Web is http://www.stevenadamaitis.com")
	void WebOfRecord4314() {
		assertEquals("http://www.stevenadamaitis.com", customers.get(4313).getWeb());
	}
}
