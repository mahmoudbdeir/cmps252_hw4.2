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
class Record_2877 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2877: FirstName is Marcelino")
	void FirstNameOfRecord2877() {
		assertEquals("Marcelino", customers.get(2876).getFirstName());
	}

	@Test
	@DisplayName("Record 2877: LastName is Stipp")
	void LastNameOfRecord2877() {
		assertEquals("Stipp", customers.get(2876).getLastName());
	}

	@Test
	@DisplayName("Record 2877: Company is United Way Of Laramie County")
	void CompanyOfRecord2877() {
		assertEquals("United Way Of Laramie County", customers.get(2876).getCompany());
	}

	@Test
	@DisplayName("Record 2877: Address is 1901 Marston St")
	void AddressOfRecord2877() {
		assertEquals("1901 Marston St", customers.get(2876).getAddress());
	}

	@Test
	@DisplayName("Record 2877: City is Detroit")
	void CityOfRecord2877() {
		assertEquals("Detroit", customers.get(2876).getCity());
	}

	@Test
	@DisplayName("Record 2877: County is Wayne")
	void CountyOfRecord2877() {
		assertEquals("Wayne", customers.get(2876).getCounty());
	}

	@Test
	@DisplayName("Record 2877: State is MI")
	void StateOfRecord2877() {
		assertEquals("MI", customers.get(2876).getState());
	}

	@Test
	@DisplayName("Record 2877: ZIP is 48211")
	void ZIPOfRecord2877() {
		assertEquals("48211", customers.get(2876).getZIP());
	}

	@Test
	@DisplayName("Record 2877: Phone is 313-875-4495")
	void PhoneOfRecord2877() {
		assertEquals("313-875-4495", customers.get(2876).getPhone());
	}

	@Test
	@DisplayName("Record 2877: Fax is 313-875-0253")
	void FaxOfRecord2877() {
		assertEquals("313-875-0253", customers.get(2876).getFax());
	}

	@Test
	@DisplayName("Record 2877: Email is marcelino@stipp.com")
	void EmailOfRecord2877() {
		assertEquals("marcelino@stipp.com", customers.get(2876).getEmail());
	}

	@Test
	@DisplayName("Record 2877: Web is http://www.marcelinostipp.com")
	void WebOfRecord2877() {
		assertEquals("http://www.marcelinostipp.com", customers.get(2876).getWeb());
	}
}
