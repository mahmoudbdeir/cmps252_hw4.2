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

@Tag("22")
class Record_2355 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2355: FirstName is Brianna")
	void FirstNameOfRecord2355() {
		assertEquals("Brianna", customers.get(2354).getFirstName());
	}

	@Test
	@DisplayName("Record 2355: LastName is Hulette")
	void LastNameOfRecord2355() {
		assertEquals("Hulette", customers.get(2354).getLastName());
	}

	@Test
	@DisplayName("Record 2355: Company is M Lipsits & Company")
	void CompanyOfRecord2355() {
		assertEquals("M Lipsits & Company", customers.get(2354).getCompany());
	}

	@Test
	@DisplayName("Record 2355: Address is 1465 Manoa Rd")
	void AddressOfRecord2355() {
		assertEquals("1465 Manoa Rd", customers.get(2354).getAddress());
	}

	@Test
	@DisplayName("Record 2355: City is Wynnewood")
	void CityOfRecord2355() {
		assertEquals("Wynnewood", customers.get(2354).getCity());
	}

	@Test
	@DisplayName("Record 2355: County is Montgomery")
	void CountyOfRecord2355() {
		assertEquals("Montgomery", customers.get(2354).getCounty());
	}

	@Test
	@DisplayName("Record 2355: State is PA")
	void StateOfRecord2355() {
		assertEquals("PA", customers.get(2354).getState());
	}

	@Test
	@DisplayName("Record 2355: ZIP is 19096")
	void ZIPOfRecord2355() {
		assertEquals("19096", customers.get(2354).getZIP());
	}

	@Test
	@DisplayName("Record 2355: Phone is 610-649-5652")
	void PhoneOfRecord2355() {
		assertEquals("610-649-5652", customers.get(2354).getPhone());
	}

	@Test
	@DisplayName("Record 2355: Fax is 610-649-2247")
	void FaxOfRecord2355() {
		assertEquals("610-649-2247", customers.get(2354).getFax());
	}

	@Test
	@DisplayName("Record 2355: Email is brianna@hulette.com")
	void EmailOfRecord2355() {
		assertEquals("brianna@hulette.com", customers.get(2354).getEmail());
	}

	@Test
	@DisplayName("Record 2355: Web is http://www.briannahulette.com")
	void WebOfRecord2355() {
		assertEquals("http://www.briannahulette.com", customers.get(2354).getWeb());
	}
}
