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

@Tag("16")
class Record_3842 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3842: FirstName is Dydre")
	void FirstNameOfRecord3842() {
		assertEquals("Dydre", customers.get(3841).getFirstName());
	}

	@Test
	@DisplayName("Record 3842: LastName is Gildersleeve")
	void LastNameOfRecord3842() {
		assertEquals("Gildersleeve", customers.get(3841).getLastName());
	}

	@Test
	@DisplayName("Record 3842: Company is Thorvilson, John L Cpa")
	void CompanyOfRecord3842() {
		assertEquals("Thorvilson, John L Cpa", customers.get(3841).getCompany());
	}

	@Test
	@DisplayName("Record 3842: Address is 340 Main St  #-910")
	void AddressOfRecord3842() {
		assertEquals("340 Main St  #-910", customers.get(3841).getAddress());
	}

	@Test
	@DisplayName("Record 3842: City is Worcester")
	void CityOfRecord3842() {
		assertEquals("Worcester", customers.get(3841).getCity());
	}

	@Test
	@DisplayName("Record 3842: County is Worcester")
	void CountyOfRecord3842() {
		assertEquals("Worcester", customers.get(3841).getCounty());
	}

	@Test
	@DisplayName("Record 3842: State is MA")
	void StateOfRecord3842() {
		assertEquals("MA", customers.get(3841).getState());
	}

	@Test
	@DisplayName("Record 3842: ZIP is 1608")
	void ZIPOfRecord3842() {
		assertEquals("1608", customers.get(3841).getZIP());
	}

	@Test
	@DisplayName("Record 3842: Phone is 508-752-0476")
	void PhoneOfRecord3842() {
		assertEquals("508-752-0476", customers.get(3841).getPhone());
	}

	@Test
	@DisplayName("Record 3842: Fax is 508-752-3353")
	void FaxOfRecord3842() {
		assertEquals("508-752-3353", customers.get(3841).getFax());
	}

	@Test
	@DisplayName("Record 3842: Email is dydre@gildersleeve.com")
	void EmailOfRecord3842() {
		assertEquals("dydre@gildersleeve.com", customers.get(3841).getEmail());
	}

	@Test
	@DisplayName("Record 3842: Web is http://www.dydregildersleeve.com")
	void WebOfRecord3842() {
		assertEquals("http://www.dydregildersleeve.com", customers.get(3841).getWeb());
	}
}
