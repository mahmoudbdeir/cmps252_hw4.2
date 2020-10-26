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

@Tag("2")
class Record_3270 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3270: FirstName is Terrence")
	void FirstNameOfRecord3270() {
		assertEquals("Terrence", customers.get(3269).getFirstName());
	}

	@Test
	@DisplayName("Record 3270: LastName is Jonhson")
	void LastNameOfRecord3270() {
		assertEquals("Jonhson", customers.get(3269).getLastName());
	}

	@Test
	@DisplayName("Record 3270: Company is Rentmaster")
	void CompanyOfRecord3270() {
		assertEquals("Rentmaster", customers.get(3269).getCompany());
	}

	@Test
	@DisplayName("Record 3270: Address is 343 Little John Way")
	void AddressOfRecord3270() {
		assertEquals("343 Little John Way", customers.get(3269).getAddress());
	}

	@Test
	@DisplayName("Record 3270: City is Webster")
	void CityOfRecord3270() {
		assertEquals("Webster", customers.get(3269).getCity());
	}

	@Test
	@DisplayName("Record 3270: County is Monroe")
	void CountyOfRecord3270() {
		assertEquals("Monroe", customers.get(3269).getCounty());
	}

	@Test
	@DisplayName("Record 3270: State is NY")
	void StateOfRecord3270() {
		assertEquals("NY", customers.get(3269).getState());
	}

	@Test
	@DisplayName("Record 3270: ZIP is 14580")
	void ZIPOfRecord3270() {
		assertEquals("14580", customers.get(3269).getZIP());
	}

	@Test
	@DisplayName("Record 3270: Phone is 585-265-6604")
	void PhoneOfRecord3270() {
		assertEquals("585-265-6604", customers.get(3269).getPhone());
	}

	@Test
	@DisplayName("Record 3270: Fax is 585-265-8044")
	void FaxOfRecord3270() {
		assertEquals("585-265-8044", customers.get(3269).getFax());
	}

	@Test
	@DisplayName("Record 3270: Email is terrence@jonhson.com")
	void EmailOfRecord3270() {
		assertEquals("terrence@jonhson.com", customers.get(3269).getEmail());
	}

	@Test
	@DisplayName("Record 3270: Web is http://www.terrencejonhson.com")
	void WebOfRecord3270() {
		assertEquals("http://www.terrencejonhson.com", customers.get(3269).getWeb());
	}
}
