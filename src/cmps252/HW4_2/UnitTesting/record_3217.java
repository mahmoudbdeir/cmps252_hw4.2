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

@Tag("12")
class Record_3217 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3217: FirstName is Lauri")
	void FirstNameOfRecord3217() {
		assertEquals("Lauri", customers.get(3216).getFirstName());
	}

	@Test
	@DisplayName("Record 3217: LastName is Winne")
	void LastNameOfRecord3217() {
		assertEquals("Winne", customers.get(3216).getLastName());
	}

	@Test
	@DisplayName("Record 3217: Company is Behringer Metal Works Inc")
	void CompanyOfRecord3217() {
		assertEquals("Behringer Metal Works Inc", customers.get(3216).getCompany());
	}

	@Test
	@DisplayName("Record 3217: Address is W Interstate I29 99 & Exit  #-15")
	void AddressOfRecord3217() {
		assertEquals("W Interstate I29 99 & Exit  #-15", customers.get(3216).getAddress());
	}

	@Test
	@DisplayName("Record 3217: City is Elk Point")
	void CityOfRecord3217() {
		assertEquals("Elk Point", customers.get(3216).getCity());
	}

	@Test
	@DisplayName("Record 3217: County is Union")
	void CountyOfRecord3217() {
		assertEquals("Union", customers.get(3216).getCounty());
	}

	@Test
	@DisplayName("Record 3217: State is SD")
	void StateOfRecord3217() {
		assertEquals("SD", customers.get(3216).getState());
	}

	@Test
	@DisplayName("Record 3217: ZIP is 57025")
	void ZIPOfRecord3217() {
		assertEquals("57025", customers.get(3216).getZIP());
	}

	@Test
	@DisplayName("Record 3217: Phone is 605-356-9301")
	void PhoneOfRecord3217() {
		assertEquals("605-356-9301", customers.get(3216).getPhone());
	}

	@Test
	@DisplayName("Record 3217: Fax is 605-356-3553")
	void FaxOfRecord3217() {
		assertEquals("605-356-3553", customers.get(3216).getFax());
	}

	@Test
	@DisplayName("Record 3217: Email is lauri@winne.com")
	void EmailOfRecord3217() {
		assertEquals("lauri@winne.com", customers.get(3216).getEmail());
	}

	@Test
	@DisplayName("Record 3217: Web is http://www.lauriwinne.com")
	void WebOfRecord3217() {
		assertEquals("http://www.lauriwinne.com", customers.get(3216).getWeb());
	}
}
