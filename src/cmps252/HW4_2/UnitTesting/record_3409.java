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
class Record_3409 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3409: FirstName is Emily")
	void FirstNameOfRecord3409() {
		assertEquals("Emily", customers.get(3408).getFirstName());
	}

	@Test
	@DisplayName("Record 3409: LastName is Finnen")
	void LastNameOfRecord3409() {
		assertEquals("Finnen", customers.get(3408).getLastName());
	}

	@Test
	@DisplayName("Record 3409: Company is Niagara Conservation Corp")
	void CompanyOfRecord3409() {
		assertEquals("Niagara Conservation Corp", customers.get(3408).getCompany());
	}

	@Test
	@DisplayName("Record 3409: Address is 80 Readington Rd")
	void AddressOfRecord3409() {
		assertEquals("80 Readington Rd", customers.get(3408).getAddress());
	}

	@Test
	@DisplayName("Record 3409: City is Somerville")
	void CityOfRecord3409() {
		assertEquals("Somerville", customers.get(3408).getCity());
	}

	@Test
	@DisplayName("Record 3409: County is Somerset")
	void CountyOfRecord3409() {
		assertEquals("Somerset", customers.get(3408).getCounty());
	}

	@Test
	@DisplayName("Record 3409: State is NJ")
	void StateOfRecord3409() {
		assertEquals("NJ", customers.get(3408).getState());
	}

	@Test
	@DisplayName("Record 3409: ZIP is 8876")
	void ZIPOfRecord3409() {
		assertEquals("8876", customers.get(3408).getZIP());
	}

	@Test
	@DisplayName("Record 3409: Phone is 908-526-8360")
	void PhoneOfRecord3409() {
		assertEquals("908-526-8360", customers.get(3408).getPhone());
	}

	@Test
	@DisplayName("Record 3409: Fax is 908-526-0121")
	void FaxOfRecord3409() {
		assertEquals("908-526-0121", customers.get(3408).getFax());
	}

	@Test
	@DisplayName("Record 3409: Email is emily@finnen.com")
	void EmailOfRecord3409() {
		assertEquals("emily@finnen.com", customers.get(3408).getEmail());
	}

	@Test
	@DisplayName("Record 3409: Web is http://www.emilyfinnen.com")
	void WebOfRecord3409() {
		assertEquals("http://www.emilyfinnen.com", customers.get(3408).getWeb());
	}
}
