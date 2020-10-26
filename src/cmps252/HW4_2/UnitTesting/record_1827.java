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

@Tag("16")
class Record_1827 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1827: FirstName is Otto")
	void FirstNameOfRecord1827() {
		assertEquals("Otto", customers.get(1826).getFirstName());
	}

	@Test
	@DisplayName("Record 1827: LastName is Wildeboer")
	void LastNameOfRecord1827() {
		assertEquals("Wildeboer", customers.get(1826).getLastName());
	}

	@Test
	@DisplayName("Record 1827: Company is Four Seasons Realty")
	void CompanyOfRecord1827() {
		assertEquals("Four Seasons Realty", customers.get(1826).getCompany());
	}

	@Test
	@DisplayName("Record 1827: Address is 1 East St")
	void AddressOfRecord1827() {
		assertEquals("1 East St", customers.get(1826).getAddress());
	}

	@Test
	@DisplayName("Record 1827: City is Riverside")
	void CityOfRecord1827() {
		assertEquals("Riverside", customers.get(1826).getCity());
	}

	@Test
	@DisplayName("Record 1827: County is Providence")
	void CountyOfRecord1827() {
		assertEquals("Providence", customers.get(1826).getCounty());
	}

	@Test
	@DisplayName("Record 1827: State is RI")
	void StateOfRecord1827() {
		assertEquals("RI", customers.get(1826).getState());
	}

	@Test
	@DisplayName("Record 1827: ZIP is 2915")
	void ZIPOfRecord1827() {
		assertEquals("2915", customers.get(1826).getZIP());
	}

	@Test
	@DisplayName("Record 1827: Phone is 401-437-7879")
	void PhoneOfRecord1827() {
		assertEquals("401-437-7879", customers.get(1826).getPhone());
	}

	@Test
	@DisplayName("Record 1827: Fax is 401-437-0623")
	void FaxOfRecord1827() {
		assertEquals("401-437-0623", customers.get(1826).getFax());
	}

	@Test
	@DisplayName("Record 1827: Email is otto@wildeboer.com")
	void EmailOfRecord1827() {
		assertEquals("otto@wildeboer.com", customers.get(1826).getEmail());
	}

	@Test
	@DisplayName("Record 1827: Web is http://www.ottowildeboer.com")
	void WebOfRecord1827() {
		assertEquals("http://www.ottowildeboer.com", customers.get(1826).getWeb());
	}
}
