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

@Tag("46")
class Record_3014 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3014: FirstName is Darla")
	void FirstNameOfRecord3014() {
		assertEquals("Darla", customers.get(3013).getFirstName());
	}

	@Test
	@DisplayName("Record 3014: LastName is Alnas")
	void LastNameOfRecord3014() {
		assertEquals("Alnas", customers.get(3013).getLastName());
	}

	@Test
	@DisplayName("Record 3014: Company is Rosenblum, Hubert Cpa")
	void CompanyOfRecord3014() {
		assertEquals("Rosenblum, Hubert Cpa", customers.get(3013).getCompany());
	}

	@Test
	@DisplayName("Record 3014: Address is 2940 W Lake St")
	void AddressOfRecord3014() {
		assertEquals("2940 W Lake St", customers.get(3013).getAddress());
	}

	@Test
	@DisplayName("Record 3014: City is Chicago")
	void CityOfRecord3014() {
		assertEquals("Chicago", customers.get(3013).getCity());
	}

	@Test
	@DisplayName("Record 3014: County is Cook")
	void CountyOfRecord3014() {
		assertEquals("Cook", customers.get(3013).getCounty());
	}

	@Test
	@DisplayName("Record 3014: State is IL")
	void StateOfRecord3014() {
		assertEquals("IL", customers.get(3013).getState());
	}

	@Test
	@DisplayName("Record 3014: ZIP is 60612")
	void ZIPOfRecord3014() {
		assertEquals("60612", customers.get(3013).getZIP());
	}

	@Test
	@DisplayName("Record 3014: Phone is 312-207-5244")
	void PhoneOfRecord3014() {
		assertEquals("312-207-5244", customers.get(3013).getPhone());
	}

	@Test
	@DisplayName("Record 3014: Fax is 312-207-7612")
	void FaxOfRecord3014() {
		assertEquals("312-207-7612", customers.get(3013).getFax());
	}

	@Test
	@DisplayName("Record 3014: Email is darla@alnas.com")
	void EmailOfRecord3014() {
		assertEquals("darla@alnas.com", customers.get(3013).getEmail());
	}

	@Test
	@DisplayName("Record 3014: Web is http://www.darlaalnas.com")
	void WebOfRecord3014() {
		assertEquals("http://www.darlaalnas.com", customers.get(3013).getWeb());
	}
}
