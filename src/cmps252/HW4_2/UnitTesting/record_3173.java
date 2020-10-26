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
class Record_3173 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3173: FirstName is Alfredo")
	void FirstNameOfRecord3173() {
		assertEquals("Alfredo", customers.get(3172).getFirstName());
	}

	@Test
	@DisplayName("Record 3173: LastName is Moglia")
	void LastNameOfRecord3173() {
		assertEquals("Moglia", customers.get(3172).getLastName());
	}

	@Test
	@DisplayName("Record 3173: Company is Association Of Surfing Pros")
	void CompanyOfRecord3173() {
		assertEquals("Association Of Surfing Pros", customers.get(3172).getCompany());
	}

	@Test
	@DisplayName("Record 3173: Address is 6509 Nw 6th Dr")
	void AddressOfRecord3173() {
		assertEquals("6509 Nw 6th Dr", customers.get(3172).getAddress());
	}

	@Test
	@DisplayName("Record 3173: City is Des Moines")
	void CityOfRecord3173() {
		assertEquals("Des Moines", customers.get(3172).getCity());
	}

	@Test
	@DisplayName("Record 3173: County is Polk")
	void CountyOfRecord3173() {
		assertEquals("Polk", customers.get(3172).getCounty());
	}

	@Test
	@DisplayName("Record 3173: State is IA")
	void StateOfRecord3173() {
		assertEquals("IA", customers.get(3172).getState());
	}

	@Test
	@DisplayName("Record 3173: ZIP is 50313")
	void ZIPOfRecord3173() {
		assertEquals("50313", customers.get(3172).getZIP());
	}

	@Test
	@DisplayName("Record 3173: Phone is 515-289-0231")
	void PhoneOfRecord3173() {
		assertEquals("515-289-0231", customers.get(3172).getPhone());
	}

	@Test
	@DisplayName("Record 3173: Fax is 515-289-9966")
	void FaxOfRecord3173() {
		assertEquals("515-289-9966", customers.get(3172).getFax());
	}

	@Test
	@DisplayName("Record 3173: Email is alfredo@moglia.com")
	void EmailOfRecord3173() {
		assertEquals("alfredo@moglia.com", customers.get(3172).getEmail());
	}

	@Test
	@DisplayName("Record 3173: Web is http://www.alfredomoglia.com")
	void WebOfRecord3173() {
		assertEquals("http://www.alfredomoglia.com", customers.get(3172).getWeb());
	}
}
