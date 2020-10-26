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

@Tag("26")
class Record_138 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 138: FirstName is Zane")
	void FirstNameOfRecord138() {
		assertEquals("Zane", customers.get(137).getFirstName());
	}

	@Test
	@DisplayName("Record 138: LastName is Tabak")
	void LastNameOfRecord138() {
		assertEquals("Tabak", customers.get(137).getLastName());
	}

	@Test
	@DisplayName("Record 138: Company is Overly Raker")
	void CompanyOfRecord138() {
		assertEquals("Overly Raker", customers.get(137).getCompany());
	}

	@Test
	@DisplayName("Record 138: Address is 80 Chamberlain St")
	void AddressOfRecord138() {
		assertEquals("80 Chamberlain St", customers.get(137).getAddress());
	}

	@Test
	@DisplayName("Record 138: City is Salinas")
	void CityOfRecord138() {
		assertEquals("Salinas", customers.get(137).getCity());
	}

	@Test
	@DisplayName("Record 138: County is Monterey")
	void CountyOfRecord138() {
		assertEquals("Monterey", customers.get(137).getCounty());
	}

	@Test
	@DisplayName("Record 138: State is CA")
	void StateOfRecord138() {
		assertEquals("CA", customers.get(137).getState());
	}

	@Test
	@DisplayName("Record 138: ZIP is 93901")
	void ZIPOfRecord138() {
		assertEquals("93901", customers.get(137).getZIP());
	}

	@Test
	@DisplayName("Record 138: Phone is 831-424-1639")
	void PhoneOfRecord138() {
		assertEquals("831-424-1639", customers.get(137).getPhone());
	}

	@Test
	@DisplayName("Record 138: Fax is 831-424-3977")
	void FaxOfRecord138() {
		assertEquals("831-424-3977", customers.get(137).getFax());
	}

	@Test
	@DisplayName("Record 138: Email is zane@tabak.com")
	void EmailOfRecord138() {
		assertEquals("zane@tabak.com", customers.get(137).getEmail());
	}

	@Test
	@DisplayName("Record 138: Web is http://www.zanetabak.com")
	void WebOfRecord138() {
		assertEquals("http://www.zanetabak.com", customers.get(137).getWeb());
	}
}
