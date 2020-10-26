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

@Tag("42")
class Record_3900 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3900: FirstName is Patrick")
	void FirstNameOfRecord3900() {
		assertEquals("Patrick", customers.get(3899).getFirstName());
	}

	@Test
	@DisplayName("Record 3900: LastName is Bartlebaugh")
	void LastNameOfRecord3900() {
		assertEquals("Bartlebaugh", customers.get(3899).getLastName());
	}

	@Test
	@DisplayName("Record 3900: Company is Sellitti, James J Esq")
	void CompanyOfRecord3900() {
		assertEquals("Sellitti, James J Esq", customers.get(3899).getCompany());
	}

	@Test
	@DisplayName("Record 3900: Address is 8396 Mississippi St")
	void AddressOfRecord3900() {
		assertEquals("8396 Mississippi St", customers.get(3899).getAddress());
	}

	@Test
	@DisplayName("Record 3900: City is Merrillville")
	void CityOfRecord3900() {
		assertEquals("Merrillville", customers.get(3899).getCity());
	}

	@Test
	@DisplayName("Record 3900: County is Lake")
	void CountyOfRecord3900() {
		assertEquals("Lake", customers.get(3899).getCounty());
	}

	@Test
	@DisplayName("Record 3900: State is IN")
	void StateOfRecord3900() {
		assertEquals("IN", customers.get(3899).getState());
	}

	@Test
	@DisplayName("Record 3900: ZIP is 46410")
	void ZIPOfRecord3900() {
		assertEquals("46410", customers.get(3899).getZIP());
	}

	@Test
	@DisplayName("Record 3900: Phone is 219-769-8723")
	void PhoneOfRecord3900() {
		assertEquals("219-769-8723", customers.get(3899).getPhone());
	}

	@Test
	@DisplayName("Record 3900: Fax is 219-769-9637")
	void FaxOfRecord3900() {
		assertEquals("219-769-9637", customers.get(3899).getFax());
	}

	@Test
	@DisplayName("Record 3900: Email is patrick@bartlebaugh.com")
	void EmailOfRecord3900() {
		assertEquals("patrick@bartlebaugh.com", customers.get(3899).getEmail());
	}

	@Test
	@DisplayName("Record 3900: Web is http://www.patrickbartlebaugh.com")
	void WebOfRecord3900() {
		assertEquals("http://www.patrickbartlebaugh.com", customers.get(3899).getWeb());
	}
}
