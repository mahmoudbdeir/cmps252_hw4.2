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
class Record_3379 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3379: FirstName is Vernice")
	void FirstNameOfRecord3379() {
		assertEquals("Vernice", customers.get(3378).getFirstName());
	}

	@Test
	@DisplayName("Record 3379: LastName is Zenor")
	void LastNameOfRecord3379() {
		assertEquals("Zenor", customers.get(3378).getLastName());
	}

	@Test
	@DisplayName("Record 3379: Company is Star Paper Tube Inc")
	void CompanyOfRecord3379() {
		assertEquals("Star Paper Tube Inc", customers.get(3378).getCompany());
	}

	@Test
	@DisplayName("Record 3379: Address is 343 N Schmidt Rd")
	void AddressOfRecord3379() {
		assertEquals("343 N Schmidt Rd", customers.get(3378).getAddress());
	}

	@Test
	@DisplayName("Record 3379: City is Bolingbrook")
	void CityOfRecord3379() {
		assertEquals("Bolingbrook", customers.get(3378).getCity());
	}

	@Test
	@DisplayName("Record 3379: County is Will")
	void CountyOfRecord3379() {
		assertEquals("Will", customers.get(3378).getCounty());
	}

	@Test
	@DisplayName("Record 3379: State is IL")
	void StateOfRecord3379() {
		assertEquals("IL", customers.get(3378).getState());
	}

	@Test
	@DisplayName("Record 3379: ZIP is 60440")
	void ZIPOfRecord3379() {
		assertEquals("60440", customers.get(3378).getZIP());
	}

	@Test
	@DisplayName("Record 3379: Phone is 630-759-8669")
	void PhoneOfRecord3379() {
		assertEquals("630-759-8669", customers.get(3378).getPhone());
	}

	@Test
	@DisplayName("Record 3379: Fax is 630-759-5356")
	void FaxOfRecord3379() {
		assertEquals("630-759-5356", customers.get(3378).getFax());
	}

	@Test
	@DisplayName("Record 3379: Email is vernice@zenor.com")
	void EmailOfRecord3379() {
		assertEquals("vernice@zenor.com", customers.get(3378).getEmail());
	}

	@Test
	@DisplayName("Record 3379: Web is http://www.vernicezenor.com")
	void WebOfRecord3379() {
		assertEquals("http://www.vernicezenor.com", customers.get(3378).getWeb());
	}
}
