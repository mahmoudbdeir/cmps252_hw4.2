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

@Tag("47")
class Record_4176 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4176: FirstName is Deann")
	void FirstNameOfRecord4176() {
		assertEquals("Deann", customers.get(4175).getFirstName());
	}

	@Test
	@DisplayName("Record 4176: LastName is Saadeh")
	void LastNameOfRecord4176() {
		assertEquals("Saadeh", customers.get(4175).getLastName());
	}

	@Test
	@DisplayName("Record 4176: Company is Mandalay Postal Center")
	void CompanyOfRecord4176() {
		assertEquals("Mandalay Postal Center", customers.get(4175).getCompany());
	}

	@Test
	@DisplayName("Record 4176: Address is 1900 N Michigan Ave")
	void AddressOfRecord4176() {
		assertEquals("1900 N Michigan Ave", customers.get(4175).getAddress());
	}

	@Test
	@DisplayName("Record 4176: City is Saginaw")
	void CityOfRecord4176() {
		assertEquals("Saginaw", customers.get(4175).getCity());
	}

	@Test
	@DisplayName("Record 4176: County is Saginaw")
	void CountyOfRecord4176() {
		assertEquals("Saginaw", customers.get(4175).getCounty());
	}

	@Test
	@DisplayName("Record 4176: State is MI")
	void StateOfRecord4176() {
		assertEquals("MI", customers.get(4175).getState());
	}

	@Test
	@DisplayName("Record 4176: ZIP is 48602")
	void ZIPOfRecord4176() {
		assertEquals("48602", customers.get(4175).getZIP());
	}

	@Test
	@DisplayName("Record 4176: Phone is 989-752-7948")
	void PhoneOfRecord4176() {
		assertEquals("989-752-7948", customers.get(4175).getPhone());
	}

	@Test
	@DisplayName("Record 4176: Fax is 989-752-8319")
	void FaxOfRecord4176() {
		assertEquals("989-752-8319", customers.get(4175).getFax());
	}

	@Test
	@DisplayName("Record 4176: Email is deann@saadeh.com")
	void EmailOfRecord4176() {
		assertEquals("deann@saadeh.com", customers.get(4175).getEmail());
	}

	@Test
	@DisplayName("Record 4176: Web is http://www.deannsaadeh.com")
	void WebOfRecord4176() {
		assertEquals("http://www.deannsaadeh.com", customers.get(4175).getWeb());
	}
}
