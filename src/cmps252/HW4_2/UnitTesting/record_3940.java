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
class Record_3940 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3940: FirstName is Jacquline")
	void FirstNameOfRecord3940() {
		assertEquals("Jacquline", customers.get(3939).getFirstName());
	}

	@Test
	@DisplayName("Record 3940: LastName is Medure")
	void LastNameOfRecord3940() {
		assertEquals("Medure", customers.get(3939).getLastName());
	}

	@Test
	@DisplayName("Record 3940: Company is Custom Converters Inc")
	void CompanyOfRecord3940() {
		assertEquals("Custom Converters Inc", customers.get(3939).getCompany());
	}

	@Test
	@DisplayName("Record 3940: Address is 164 Oak Brk Cntr Mall")
	void AddressOfRecord3940() {
		assertEquals("164 Oak Brk Cntr Mall", customers.get(3939).getAddress());
	}

	@Test
	@DisplayName("Record 3940: City is Hinsdale")
	void CityOfRecord3940() {
		assertEquals("Hinsdale", customers.get(3939).getCity());
	}

	@Test
	@DisplayName("Record 3940: County is DuPage")
	void CountyOfRecord3940() {
		assertEquals("DuPage", customers.get(3939).getCounty());
	}

	@Test
	@DisplayName("Record 3940: State is IL")
	void StateOfRecord3940() {
		assertEquals("IL", customers.get(3939).getState());
	}

	@Test
	@DisplayName("Record 3940: ZIP is 60521")
	void ZIPOfRecord3940() {
		assertEquals("60521", customers.get(3939).getZIP());
	}

	@Test
	@DisplayName("Record 3940: Phone is 630-573-7578")
	void PhoneOfRecord3940() {
		assertEquals("630-573-7578", customers.get(3939).getPhone());
	}

	@Test
	@DisplayName("Record 3940: Fax is 630-573-2148")
	void FaxOfRecord3940() {
		assertEquals("630-573-2148", customers.get(3939).getFax());
	}

	@Test
	@DisplayName("Record 3940: Email is jacquline@medure.com")
	void EmailOfRecord3940() {
		assertEquals("jacquline@medure.com", customers.get(3939).getEmail());
	}

	@Test
	@DisplayName("Record 3940: Web is http://www.jacqulinemedure.com")
	void WebOfRecord3940() {
		assertEquals("http://www.jacqulinemedure.com", customers.get(3939).getWeb());
	}
}
