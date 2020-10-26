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
class Record_2988 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2988: FirstName is Ray")
	void FirstNameOfRecord2988() {
		assertEquals("Ray", customers.get(2987).getFirstName());
	}

	@Test
	@DisplayName("Record 2988: LastName is Thorell")
	void LastNameOfRecord2988() {
		assertEquals("Thorell", customers.get(2987).getLastName());
	}

	@Test
	@DisplayName("Record 2988: Company is Garrett, R Joyce Esq")
	void CompanyOfRecord2988() {
		assertEquals("Garrett, R Joyce Esq", customers.get(2987).getCompany());
	}

	@Test
	@DisplayName("Record 2988: Address is 2101 E Ben White Blvd")
	void AddressOfRecord2988() {
		assertEquals("2101 E Ben White Blvd", customers.get(2987).getAddress());
	}

	@Test
	@DisplayName("Record 2988: City is Austin")
	void CityOfRecord2988() {
		assertEquals("Austin", customers.get(2987).getCity());
	}

	@Test
	@DisplayName("Record 2988: County is Travis")
	void CountyOfRecord2988() {
		assertEquals("Travis", customers.get(2987).getCounty());
	}

	@Test
	@DisplayName("Record 2988: State is TX")
	void StateOfRecord2988() {
		assertEquals("TX", customers.get(2987).getState());
	}

	@Test
	@DisplayName("Record 2988: ZIP is 78741")
	void ZIPOfRecord2988() {
		assertEquals("78741", customers.get(2987).getZIP());
	}

	@Test
	@DisplayName("Record 2988: Phone is 512-462-2990")
	void PhoneOfRecord2988() {
		assertEquals("512-462-2990", customers.get(2987).getPhone());
	}

	@Test
	@DisplayName("Record 2988: Fax is 512-462-6678")
	void FaxOfRecord2988() {
		assertEquals("512-462-6678", customers.get(2987).getFax());
	}

	@Test
	@DisplayName("Record 2988: Email is ray@thorell.com")
	void EmailOfRecord2988() {
		assertEquals("ray@thorell.com", customers.get(2987).getEmail());
	}

	@Test
	@DisplayName("Record 2988: Web is http://www.raythorell.com")
	void WebOfRecord2988() {
		assertEquals("http://www.raythorell.com", customers.get(2987).getWeb());
	}
}
