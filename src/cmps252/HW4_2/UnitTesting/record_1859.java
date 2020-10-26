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

@Tag("41")
class Record_1859 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1859: FirstName is Art")
	void FirstNameOfRecord1859() {
		assertEquals("Art", customers.get(1858).getFirstName());
	}

	@Test
	@DisplayName("Record 1859: LastName is Bustillos")
	void LastNameOfRecord1859() {
		assertEquals("Bustillos", customers.get(1858).getLastName());
	}

	@Test
	@DisplayName("Record 1859: Company is Polyplastic Forms Inc")
	void CompanyOfRecord1859() {
		assertEquals("Polyplastic Forms Inc", customers.get(1858).getCompany());
	}

	@Test
	@DisplayName("Record 1859: Address is 225 Madison Ave")
	void AddressOfRecord1859() {
		assertEquals("225 Madison Ave", customers.get(1858).getAddress());
	}

	@Test
	@DisplayName("Record 1859: City is Morristown")
	void CityOfRecord1859() {
		assertEquals("Morristown", customers.get(1858).getCity());
	}

	@Test
	@DisplayName("Record 1859: County is Morris")
	void CountyOfRecord1859() {
		assertEquals("Morris", customers.get(1858).getCounty());
	}

	@Test
	@DisplayName("Record 1859: State is NJ")
	void StateOfRecord1859() {
		assertEquals("NJ", customers.get(1858).getState());
	}

	@Test
	@DisplayName("Record 1859: ZIP is 7960")
	void ZIPOfRecord1859() {
		assertEquals("7960", customers.get(1858).getZIP());
	}

	@Test
	@DisplayName("Record 1859: Phone is 973-539-4435")
	void PhoneOfRecord1859() {
		assertEquals("973-539-4435", customers.get(1858).getPhone());
	}

	@Test
	@DisplayName("Record 1859: Fax is 973-539-6717")
	void FaxOfRecord1859() {
		assertEquals("973-539-6717", customers.get(1858).getFax());
	}

	@Test
	@DisplayName("Record 1859: Email is art@bustillos.com")
	void EmailOfRecord1859() {
		assertEquals("art@bustillos.com", customers.get(1858).getEmail());
	}

	@Test
	@DisplayName("Record 1859: Web is http://www.artbustillos.com")
	void WebOfRecord1859() {
		assertEquals("http://www.artbustillos.com", customers.get(1858).getWeb());
	}
}
