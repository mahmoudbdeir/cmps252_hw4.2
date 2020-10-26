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

@Tag("8")
class Record_2848 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2848: FirstName is Melvin")
	void FirstNameOfRecord2848() {
		assertEquals("Melvin", customers.get(2847).getFirstName());
	}

	@Test
	@DisplayName("Record 2848: LastName is Lartigue")
	void LastNameOfRecord2848() {
		assertEquals("Lartigue", customers.get(2847).getLastName());
	}

	@Test
	@DisplayName("Record 2848: Company is Yorkshire Uniforms")
	void CompanyOfRecord2848() {
		assertEquals("Yorkshire Uniforms", customers.get(2847).getCompany());
	}

	@Test
	@DisplayName("Record 2848: Address is 7700 Hall St")
	void AddressOfRecord2848() {
		assertEquals("7700 Hall St", customers.get(2847).getAddress());
	}

	@Test
	@DisplayName("Record 2848: City is Saint Louis")
	void CityOfRecord2848() {
		assertEquals("Saint Louis", customers.get(2847).getCity());
	}

	@Test
	@DisplayName("Record 2848: County is Saint Louis City")
	void CountyOfRecord2848() {
		assertEquals("Saint Louis City", customers.get(2847).getCounty());
	}

	@Test
	@DisplayName("Record 2848: State is MO")
	void StateOfRecord2848() {
		assertEquals("MO", customers.get(2847).getState());
	}

	@Test
	@DisplayName("Record 2848: ZIP is 63147")
	void ZIPOfRecord2848() {
		assertEquals("63147", customers.get(2847).getZIP());
	}

	@Test
	@DisplayName("Record 2848: Phone is 314-383-5690")
	void PhoneOfRecord2848() {
		assertEquals("314-383-5690", customers.get(2847).getPhone());
	}

	@Test
	@DisplayName("Record 2848: Fax is 314-383-9668")
	void FaxOfRecord2848() {
		assertEquals("314-383-9668", customers.get(2847).getFax());
	}

	@Test
	@DisplayName("Record 2848: Email is melvin@lartigue.com")
	void EmailOfRecord2848() {
		assertEquals("melvin@lartigue.com", customers.get(2847).getEmail());
	}

	@Test
	@DisplayName("Record 2848: Web is http://www.melvinlartigue.com")
	void WebOfRecord2848() {
		assertEquals("http://www.melvinlartigue.com", customers.get(2847).getWeb());
	}
}
