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

@Tag("33")
class Record_3999 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3999: FirstName is Dylan")
	void FirstNameOfRecord3999() {
		assertEquals("Dylan", customers.get(3998).getFirstName());
	}

	@Test
	@DisplayName("Record 3999: LastName is Mogan")
	void LastNameOfRecord3999() {
		assertEquals("Mogan", customers.get(3998).getLastName());
	}

	@Test
	@DisplayName("Record 3999: Company is Fort Worth Masonry")
	void CompanyOfRecord3999() {
		assertEquals("Fort Worth Masonry", customers.get(3998).getCompany());
	}

	@Test
	@DisplayName("Record 3999: Address is 4600 E Lake Blvd")
	void AddressOfRecord3999() {
		assertEquals("4600 E Lake Blvd", customers.get(3998).getAddress());
	}

	@Test
	@DisplayName("Record 3999: City is Birmingham")
	void CityOfRecord3999() {
		assertEquals("Birmingham", customers.get(3998).getCity());
	}

	@Test
	@DisplayName("Record 3999: County is Jefferson")
	void CountyOfRecord3999() {
		assertEquals("Jefferson", customers.get(3998).getCounty());
	}

	@Test
	@DisplayName("Record 3999: State is AL")
	void StateOfRecord3999() {
		assertEquals("AL", customers.get(3998).getState());
	}

	@Test
	@DisplayName("Record 3999: ZIP is 35217")
	void ZIPOfRecord3999() {
		assertEquals("35217", customers.get(3998).getZIP());
	}

	@Test
	@DisplayName("Record 3999: Phone is 205-849-1473")
	void PhoneOfRecord3999() {
		assertEquals("205-849-1473", customers.get(3998).getPhone());
	}

	@Test
	@DisplayName("Record 3999: Fax is 205-849-0131")
	void FaxOfRecord3999() {
		assertEquals("205-849-0131", customers.get(3998).getFax());
	}

	@Test
	@DisplayName("Record 3999: Email is dylan@mogan.com")
	void EmailOfRecord3999() {
		assertEquals("dylan@mogan.com", customers.get(3998).getEmail());
	}

	@Test
	@DisplayName("Record 3999: Web is http://www.dylanmogan.com")
	void WebOfRecord3999() {
		assertEquals("http://www.dylanmogan.com", customers.get(3998).getWeb());
	}
}
