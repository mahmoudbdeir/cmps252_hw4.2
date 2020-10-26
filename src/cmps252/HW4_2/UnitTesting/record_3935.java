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

@Tag("6")
class Record_3935 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3935: FirstName is Katharine")
	void FirstNameOfRecord3935() {
		assertEquals("Katharine", customers.get(3934).getFirstName());
	}

	@Test
	@DisplayName("Record 3935: LastName is Jurden")
	void LastNameOfRecord3935() {
		assertEquals("Jurden", customers.get(3934).getLastName());
	}

	@Test
	@DisplayName("Record 3935: Company is Franck Mundt & Franck")
	void CompanyOfRecord3935() {
		assertEquals("Franck Mundt & Franck", customers.get(3934).getCompany());
	}

	@Test
	@DisplayName("Record 3935: Address is 410 Lakeville Rd")
	void AddressOfRecord3935() {
		assertEquals("410 Lakeville Rd", customers.get(3934).getAddress());
	}

	@Test
	@DisplayName("Record 3935: City is New Hyde Park")
	void CityOfRecord3935() {
		assertEquals("New Hyde Park", customers.get(3934).getCity());
	}

	@Test
	@DisplayName("Record 3935: County is Nassau")
	void CountyOfRecord3935() {
		assertEquals("Nassau", customers.get(3934).getCounty());
	}

	@Test
	@DisplayName("Record 3935: State is NY")
	void StateOfRecord3935() {
		assertEquals("NY", customers.get(3934).getState());
	}

	@Test
	@DisplayName("Record 3935: ZIP is 11042")
	void ZIPOfRecord3935() {
		assertEquals("11042", customers.get(3934).getZIP());
	}

	@Test
	@DisplayName("Record 3935: Phone is 516-352-8614")
	void PhoneOfRecord3935() {
		assertEquals("516-352-8614", customers.get(3934).getPhone());
	}

	@Test
	@DisplayName("Record 3935: Fax is 516-352-2223")
	void FaxOfRecord3935() {
		assertEquals("516-352-2223", customers.get(3934).getFax());
	}

	@Test
	@DisplayName("Record 3935: Email is katharine@jurden.com")
	void EmailOfRecord3935() {
		assertEquals("katharine@jurden.com", customers.get(3934).getEmail());
	}

	@Test
	@DisplayName("Record 3935: Web is http://www.katharinejurden.com")
	void WebOfRecord3935() {
		assertEquals("http://www.katharinejurden.com", customers.get(3934).getWeb());
	}
}
