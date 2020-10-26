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

@Tag("42")
class Record_4023 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4023: FirstName is Raquel")
	void FirstNameOfRecord4023() {
		assertEquals("Raquel", customers.get(4022).getFirstName());
	}

	@Test
	@DisplayName("Record 4023: LastName is Saxinger")
	void LastNameOfRecord4023() {
		assertEquals("Saxinger", customers.get(4022).getLastName());
	}

	@Test
	@DisplayName("Record 4023: Company is Arrowhead Regional Dev Comm")
	void CompanyOfRecord4023() {
		assertEquals("Arrowhead Regional Dev Comm", customers.get(4022).getCompany());
	}

	@Test
	@DisplayName("Record 4023: Address is 303 N Broadway St")
	void AddressOfRecord4023() {
		assertEquals("303 N Broadway St", customers.get(4022).getAddress());
	}

	@Test
	@DisplayName("Record 4023: City is Abilene")
	void CityOfRecord4023() {
		assertEquals("Abilene", customers.get(4022).getCity());
	}

	@Test
	@DisplayName("Record 4023: County is Dickinson")
	void CountyOfRecord4023() {
		assertEquals("Dickinson", customers.get(4022).getCounty());
	}

	@Test
	@DisplayName("Record 4023: State is KS")
	void StateOfRecord4023() {
		assertEquals("KS", customers.get(4022).getState());
	}

	@Test
	@DisplayName("Record 4023: ZIP is 67410")
	void ZIPOfRecord4023() {
		assertEquals("67410", customers.get(4022).getZIP());
	}

	@Test
	@DisplayName("Record 4023: Phone is 785-263-2308")
	void PhoneOfRecord4023() {
		assertEquals("785-263-2308", customers.get(4022).getPhone());
	}

	@Test
	@DisplayName("Record 4023: Fax is 785-263-7236")
	void FaxOfRecord4023() {
		assertEquals("785-263-7236", customers.get(4022).getFax());
	}

	@Test
	@DisplayName("Record 4023: Email is raquel@saxinger.com")
	void EmailOfRecord4023() {
		assertEquals("raquel@saxinger.com", customers.get(4022).getEmail());
	}

	@Test
	@DisplayName("Record 4023: Web is http://www.raquelsaxinger.com")
	void WebOfRecord4023() {
		assertEquals("http://www.raquelsaxinger.com", customers.get(4022).getWeb());
	}
}
