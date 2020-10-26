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

@Tag("0")
class Record_3779 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3779: FirstName is Lamar")
	void FirstNameOfRecord3779() {
		assertEquals("Lamar", customers.get(3778).getFirstName());
	}

	@Test
	@DisplayName("Record 3779: LastName is Mcvygh")
	void LastNameOfRecord3779() {
		assertEquals("Mcvygh", customers.get(3778).getLastName());
	}

	@Test
	@DisplayName("Record 3779: Company is Kona Kohala Chamber Of Commrce")
	void CompanyOfRecord3779() {
		assertEquals("Kona Kohala Chamber Of Commrce", customers.get(3778).getCompany());
	}

	@Test
	@DisplayName("Record 3779: Address is 1550 First State Blvd")
	void AddressOfRecord3779() {
		assertEquals("1550 First State Blvd", customers.get(3778).getAddress());
	}

	@Test
	@DisplayName("Record 3779: City is Wilmington")
	void CityOfRecord3779() {
		assertEquals("Wilmington", customers.get(3778).getCity());
	}

	@Test
	@DisplayName("Record 3779: County is New Castle")
	void CountyOfRecord3779() {
		assertEquals("New Castle", customers.get(3778).getCounty());
	}

	@Test
	@DisplayName("Record 3779: State is DE")
	void StateOfRecord3779() {
		assertEquals("DE", customers.get(3778).getState());
	}

	@Test
	@DisplayName("Record 3779: ZIP is 19804")
	void ZIPOfRecord3779() {
		assertEquals("19804", customers.get(3778).getZIP());
	}

	@Test
	@DisplayName("Record 3779: Phone is 302-994-5354")
	void PhoneOfRecord3779() {
		assertEquals("302-994-5354", customers.get(3778).getPhone());
	}

	@Test
	@DisplayName("Record 3779: Fax is 302-994-1949")
	void FaxOfRecord3779() {
		assertEquals("302-994-1949", customers.get(3778).getFax());
	}

	@Test
	@DisplayName("Record 3779: Email is lamar@mcvygh.com")
	void EmailOfRecord3779() {
		assertEquals("lamar@mcvygh.com", customers.get(3778).getEmail());
	}

	@Test
	@DisplayName("Record 3779: Web is http://www.lamarmcvygh.com")
	void WebOfRecord3779() {
		assertEquals("http://www.lamarmcvygh.com", customers.get(3778).getWeb());
	}
}
