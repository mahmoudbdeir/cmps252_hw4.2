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
class Record_2629 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2629: FirstName is Lane")
	void FirstNameOfRecord2629() {
		assertEquals("Lane", customers.get(2628).getFirstName());
	}

	@Test
	@DisplayName("Record 2629: LastName is Kilday")
	void LastNameOfRecord2629() {
		assertEquals("Kilday", customers.get(2628).getLastName());
	}

	@Test
	@DisplayName("Record 2629: Company is Alltemps Inc")
	void CompanyOfRecord2629() {
		assertEquals("Alltemps Inc", customers.get(2628).getCompany());
	}

	@Test
	@DisplayName("Record 2629: Address is 2008 National Guard Dr")
	void AddressOfRecord2629() {
		assertEquals("2008 National Guard Dr", customers.get(2628).getAddress());
	}

	@Test
	@DisplayName("Record 2629: City is Plant City")
	void CityOfRecord2629() {
		assertEquals("Plant City", customers.get(2628).getCity());
	}

	@Test
	@DisplayName("Record 2629: County is Hillsborough")
	void CountyOfRecord2629() {
		assertEquals("Hillsborough", customers.get(2628).getCounty());
	}

	@Test
	@DisplayName("Record 2629: State is FL")
	void StateOfRecord2629() {
		assertEquals("FL", customers.get(2628).getState());
	}

	@Test
	@DisplayName("Record 2629: ZIP is 33567")
	void ZIPOfRecord2629() {
		assertEquals("33567", customers.get(2628).getZIP());
	}

	@Test
	@DisplayName("Record 2629: Phone is 813-754-5657")
	void PhoneOfRecord2629() {
		assertEquals("813-754-5657", customers.get(2628).getPhone());
	}

	@Test
	@DisplayName("Record 2629: Fax is 813-754-8145")
	void FaxOfRecord2629() {
		assertEquals("813-754-8145", customers.get(2628).getFax());
	}

	@Test
	@DisplayName("Record 2629: Email is lane@kilday.com")
	void EmailOfRecord2629() {
		assertEquals("lane@kilday.com", customers.get(2628).getEmail());
	}

	@Test
	@DisplayName("Record 2629: Web is http://www.lanekilday.com")
	void WebOfRecord2629() {
		assertEquals("http://www.lanekilday.com", customers.get(2628).getWeb());
	}
}
