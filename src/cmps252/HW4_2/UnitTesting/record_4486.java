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

@Tag("40")
class Record_4486 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4486: FirstName is Josef")
	void FirstNameOfRecord4486() {
		assertEquals("Josef", customers.get(4485).getFirstName());
	}

	@Test
	@DisplayName("Record 4486: LastName is Owsley")
	void LastNameOfRecord4486() {
		assertEquals("Owsley", customers.get(4485).getLastName());
	}

	@Test
	@DisplayName("Record 4486: Company is American Office Equipment Aoe")
	void CompanyOfRecord4486() {
		assertEquals("American Office Equipment Aoe", customers.get(4485).getCompany());
	}

	@Test
	@DisplayName("Record 4486: Address is 96 84th St Sw")
	void AddressOfRecord4486() {
		assertEquals("96 84th St Sw", customers.get(4485).getAddress());
	}

	@Test
	@DisplayName("Record 4486: City is Byron Center")
	void CityOfRecord4486() {
		assertEquals("Byron Center", customers.get(4485).getCity());
	}

	@Test
	@DisplayName("Record 4486: County is Kent")
	void CountyOfRecord4486() {
		assertEquals("Kent", customers.get(4485).getCounty());
	}

	@Test
	@DisplayName("Record 4486: State is MI")
	void StateOfRecord4486() {
		assertEquals("MI", customers.get(4485).getState());
	}

	@Test
	@DisplayName("Record 4486: ZIP is 49315")
	void ZIPOfRecord4486() {
		assertEquals("49315", customers.get(4485).getZIP());
	}

	@Test
	@DisplayName("Record 4486: Phone is 616-455-4096")
	void PhoneOfRecord4486() {
		assertEquals("616-455-4096", customers.get(4485).getPhone());
	}

	@Test
	@DisplayName("Record 4486: Fax is 616-455-6927")
	void FaxOfRecord4486() {
		assertEquals("616-455-6927", customers.get(4485).getFax());
	}

	@Test
	@DisplayName("Record 4486: Email is josef@owsley.com")
	void EmailOfRecord4486() {
		assertEquals("josef@owsley.com", customers.get(4485).getEmail());
	}

	@Test
	@DisplayName("Record 4486: Web is http://www.josefowsley.com")
	void WebOfRecord4486() {
		assertEquals("http://www.josefowsley.com", customers.get(4485).getWeb());
	}
}
