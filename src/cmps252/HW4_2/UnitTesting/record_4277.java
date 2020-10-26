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

@Tag("45")
class Record_4277 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4277: FirstName is Juliet")
	void FirstNameOfRecord4277() {
		assertEquals("Juliet", customers.get(4276).getFirstName());
	}

	@Test
	@DisplayName("Record 4277: LastName is Ong")
	void LastNameOfRecord4277() {
		assertEquals("Ong", customers.get(4276).getLastName());
	}

	@Test
	@DisplayName("Record 4277: Company is Forsgaard, Karl F Esq")
	void CompanyOfRecord4277() {
		assertEquals("Forsgaard, Karl F Esq", customers.get(4276).getCompany());
	}

	@Test
	@DisplayName("Record 4277: Address is Hwy 251n N & Hwy 38")
	void AddressOfRecord4277() {
		assertEquals("Hwy 251n N & Hwy 38", customers.get(4276).getAddress());
	}

	@Test
	@DisplayName("Record 4277: City is Rochelle")
	void CityOfRecord4277() {
		assertEquals("Rochelle", customers.get(4276).getCity());
	}

	@Test
	@DisplayName("Record 4277: County is Ogle")
	void CountyOfRecord4277() {
		assertEquals("Ogle", customers.get(4276).getCounty());
	}

	@Test
	@DisplayName("Record 4277: State is IL")
	void StateOfRecord4277() {
		assertEquals("IL", customers.get(4276).getState());
	}

	@Test
	@DisplayName("Record 4277: ZIP is 61068")
	void ZIPOfRecord4277() {
		assertEquals("61068", customers.get(4276).getZIP());
	}

	@Test
	@DisplayName("Record 4277: Phone is 815-562-9820")
	void PhoneOfRecord4277() {
		assertEquals("815-562-9820", customers.get(4276).getPhone());
	}

	@Test
	@DisplayName("Record 4277: Fax is 815-562-1622")
	void FaxOfRecord4277() {
		assertEquals("815-562-1622", customers.get(4276).getFax());
	}

	@Test
	@DisplayName("Record 4277: Email is juliet@ong.com")
	void EmailOfRecord4277() {
		assertEquals("juliet@ong.com", customers.get(4276).getEmail());
	}

	@Test
	@DisplayName("Record 4277: Web is http://www.julietong.com")
	void WebOfRecord4277() {
		assertEquals("http://www.julietong.com", customers.get(4276).getWeb());
	}
}
