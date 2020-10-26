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

@Tag("14")
class Record_4490 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4490: FirstName is Normand")
	void FirstNameOfRecord4490() {
		assertEquals("Normand", customers.get(4489).getFirstName());
	}

	@Test
	@DisplayName("Record 4490: LastName is Cooper")
	void LastNameOfRecord4490() {
		assertEquals("Cooper", customers.get(4489).getLastName());
	}

	@Test
	@DisplayName("Record 4490: Company is Froderman, Troy B Esq")
	void CompanyOfRecord4490() {
		assertEquals("Froderman, Troy B Esq", customers.get(4489).getCompany());
	}

	@Test
	@DisplayName("Record 4490: Address is 1609 N 14th St")
	void AddressOfRecord4490() {
		assertEquals("1609 N 14th St", customers.get(4489).getAddress());
	}

	@Test
	@DisplayName("Record 4490: City is Saint Louis")
	void CityOfRecord4490() {
		assertEquals("Saint Louis", customers.get(4489).getCity());
	}

	@Test
	@DisplayName("Record 4490: County is Saint Louis City")
	void CountyOfRecord4490() {
		assertEquals("Saint Louis City", customers.get(4489).getCounty());
	}

	@Test
	@DisplayName("Record 4490: State is MO")
	void StateOfRecord4490() {
		assertEquals("MO", customers.get(4489).getState());
	}

	@Test
	@DisplayName("Record 4490: ZIP is 63106")
	void ZIPOfRecord4490() {
		assertEquals("63106", customers.get(4489).getZIP());
	}

	@Test
	@DisplayName("Record 4490: Phone is 314-231-2414")
	void PhoneOfRecord4490() {
		assertEquals("314-231-2414", customers.get(4489).getPhone());
	}

	@Test
	@DisplayName("Record 4490: Fax is 314-231-7855")
	void FaxOfRecord4490() {
		assertEquals("314-231-7855", customers.get(4489).getFax());
	}

	@Test
	@DisplayName("Record 4490: Email is normand@cooper.com")
	void EmailOfRecord4490() {
		assertEquals("normand@cooper.com", customers.get(4489).getEmail());
	}

	@Test
	@DisplayName("Record 4490: Web is http://www.normandcooper.com")
	void WebOfRecord4490() {
		assertEquals("http://www.normandcooper.com", customers.get(4489).getWeb());
	}
}
