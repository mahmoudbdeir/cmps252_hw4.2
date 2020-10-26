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

@Tag("13")
class Record_1640 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1640: FirstName is Karl")
	void FirstNameOfRecord1640() {
		assertEquals("Karl", customers.get(1639).getFirstName());
	}

	@Test
	@DisplayName("Record 1640: LastName is Orrico")
	void LastNameOfRecord1640() {
		assertEquals("Orrico", customers.get(1639).getLastName());
	}

	@Test
	@DisplayName("Record 1640: Company is Diversified Air Systems Inc")
	void CompanyOfRecord1640() {
		assertEquals("Diversified Air Systems Inc", customers.get(1639).getCompany());
	}

	@Test
	@DisplayName("Record 1640: Address is 1070 S Dupont Hwy")
	void AddressOfRecord1640() {
		assertEquals("1070 S Dupont Hwy", customers.get(1639).getAddress());
	}

	@Test
	@DisplayName("Record 1640: City is Dover")
	void CityOfRecord1640() {
		assertEquals("Dover", customers.get(1639).getCity());
	}

	@Test
	@DisplayName("Record 1640: County is Kent")
	void CountyOfRecord1640() {
		assertEquals("Kent", customers.get(1639).getCounty());
	}

	@Test
	@DisplayName("Record 1640: State is DE")
	void StateOfRecord1640() {
		assertEquals("DE", customers.get(1639).getState());
	}

	@Test
	@DisplayName("Record 1640: ZIP is 19901")
	void ZIPOfRecord1640() {
		assertEquals("19901", customers.get(1639).getZIP());
	}

	@Test
	@DisplayName("Record 1640: Phone is 302-734-9793")
	void PhoneOfRecord1640() {
		assertEquals("302-734-9793", customers.get(1639).getPhone());
	}

	@Test
	@DisplayName("Record 1640: Fax is 302-734-7797")
	void FaxOfRecord1640() {
		assertEquals("302-734-7797", customers.get(1639).getFax());
	}

	@Test
	@DisplayName("Record 1640: Email is karl@orrico.com")
	void EmailOfRecord1640() {
		assertEquals("karl@orrico.com", customers.get(1639).getEmail());
	}

	@Test
	@DisplayName("Record 1640: Web is http://www.karlorrico.com")
	void WebOfRecord1640() {
		assertEquals("http://www.karlorrico.com", customers.get(1639).getWeb());
	}
}
