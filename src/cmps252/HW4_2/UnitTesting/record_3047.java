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

@Tag("28")
class Record_3047 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3047: FirstName is Elda")
	void FirstNameOfRecord3047() {
		assertEquals("Elda", customers.get(3046).getFirstName());
	}

	@Test
	@DisplayName("Record 3047: LastName is Sweger")
	void LastNameOfRecord3047() {
		assertEquals("Sweger", customers.get(3046).getLastName());
	}

	@Test
	@DisplayName("Record 3047: Company is Continental Pblshng Co In Inc")
	void CompanyOfRecord3047() {
		assertEquals("Continental Pblshng Co In Inc", customers.get(3046).getCompany());
	}

	@Test
	@DisplayName("Record 3047: Address is 5201 Monroe St")
	void AddressOfRecord3047() {
		assertEquals("5201 Monroe St", customers.get(3046).getAddress());
	}

	@Test
	@DisplayName("Record 3047: City is Toledo")
	void CityOfRecord3047() {
		assertEquals("Toledo", customers.get(3046).getCity());
	}

	@Test
	@DisplayName("Record 3047: County is Lucas")
	void CountyOfRecord3047() {
		assertEquals("Lucas", customers.get(3046).getCounty());
	}

	@Test
	@DisplayName("Record 3047: State is OH")
	void StateOfRecord3047() {
		assertEquals("OH", customers.get(3046).getState());
	}

	@Test
	@DisplayName("Record 3047: ZIP is 43623")
	void ZIPOfRecord3047() {
		assertEquals("43623", customers.get(3046).getZIP());
	}

	@Test
	@DisplayName("Record 3047: Phone is 419-885-5851")
	void PhoneOfRecord3047() {
		assertEquals("419-885-5851", customers.get(3046).getPhone());
	}

	@Test
	@DisplayName("Record 3047: Fax is 419-885-5554")
	void FaxOfRecord3047() {
		assertEquals("419-885-5554", customers.get(3046).getFax());
	}

	@Test
	@DisplayName("Record 3047: Email is elda@sweger.com")
	void EmailOfRecord3047() {
		assertEquals("elda@sweger.com", customers.get(3046).getEmail());
	}

	@Test
	@DisplayName("Record 3047: Web is http://www.eldasweger.com")
	void WebOfRecord3047() {
		assertEquals("http://www.eldasweger.com", customers.get(3046).getWeb());
	}
}
