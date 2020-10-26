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

@Tag("39")
class Record_4328 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4328: FirstName is Ingrid")
	void FirstNameOfRecord4328() {
		assertEquals("Ingrid", customers.get(4327).getFirstName());
	}

	@Test
	@DisplayName("Record 4328: LastName is Burnias")
	void LastNameOfRecord4328() {
		assertEquals("Burnias", customers.get(4327).getLastName());
	}

	@Test
	@DisplayName("Record 4328: Company is P E Cheney Engineering Co Inc")
	void CompanyOfRecord4328() {
		assertEquals("P E Cheney Engineering Co Inc", customers.get(4327).getCompany());
	}

	@Test
	@DisplayName("Record 4328: Address is 70080 Exchange St")
	void AddressOfRecord4328() {
		assertEquals("70080 Exchange St", customers.get(4327).getAddress());
	}

	@Test
	@DisplayName("Record 4328: City is Binghamton")
	void CityOfRecord4328() {
		assertEquals("Binghamton", customers.get(4327).getCity());
	}

	@Test
	@DisplayName("Record 4328: County is Broome")
	void CountyOfRecord4328() {
		assertEquals("Broome", customers.get(4327).getCounty());
	}

	@Test
	@DisplayName("Record 4328: State is NY")
	void StateOfRecord4328() {
		assertEquals("NY", customers.get(4327).getState());
	}

	@Test
	@DisplayName("Record 4328: ZIP is 13901")
	void ZIPOfRecord4328() {
		assertEquals("13901", customers.get(4327).getZIP());
	}

	@Test
	@DisplayName("Record 4328: Phone is 607-723-9271")
	void PhoneOfRecord4328() {
		assertEquals("607-723-9271", customers.get(4327).getPhone());
	}

	@Test
	@DisplayName("Record 4328: Fax is 607-723-2332")
	void FaxOfRecord4328() {
		assertEquals("607-723-2332", customers.get(4327).getFax());
	}

	@Test
	@DisplayName("Record 4328: Email is ingrid@burnias.com")
	void EmailOfRecord4328() {
		assertEquals("ingrid@burnias.com", customers.get(4327).getEmail());
	}

	@Test
	@DisplayName("Record 4328: Web is http://www.ingridburnias.com")
	void WebOfRecord4328() {
		assertEquals("http://www.ingridburnias.com", customers.get(4327).getWeb());
	}
}
