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

@Tag("31")
class Record_4087 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4087: FirstName is Paulette")
	void FirstNameOfRecord4087() {
		assertEquals("Paulette", customers.get(4086).getFirstName());
	}

	@Test
	@DisplayName("Record 4087: LastName is Abaloz")
	void LastNameOfRecord4087() {
		assertEquals("Abaloz", customers.get(4086).getLastName());
	}

	@Test
	@DisplayName("Record 4087: Company is Anderson, Stephen R Cpa")
	void CompanyOfRecord4087() {
		assertEquals("Anderson, Stephen R Cpa", customers.get(4086).getCompany());
	}

	@Test
	@DisplayName("Record 4087: Address is 240 W Passaic St")
	void AddressOfRecord4087() {
		assertEquals("240 W Passaic St", customers.get(4086).getAddress());
	}

	@Test
	@DisplayName("Record 4087: City is Maywood")
	void CityOfRecord4087() {
		assertEquals("Maywood", customers.get(4086).getCity());
	}

	@Test
	@DisplayName("Record 4087: County is Bergen")
	void CountyOfRecord4087() {
		assertEquals("Bergen", customers.get(4086).getCounty());
	}

	@Test
	@DisplayName("Record 4087: State is NJ")
	void StateOfRecord4087() {
		assertEquals("NJ", customers.get(4086).getState());
	}

	@Test
	@DisplayName("Record 4087: ZIP is 7607")
	void ZIPOfRecord4087() {
		assertEquals("7607", customers.get(4086).getZIP());
	}

	@Test
	@DisplayName("Record 4087: Phone is 201-845-5269")
	void PhoneOfRecord4087() {
		assertEquals("201-845-5269", customers.get(4086).getPhone());
	}

	@Test
	@DisplayName("Record 4087: Fax is 201-845-8779")
	void FaxOfRecord4087() {
		assertEquals("201-845-8779", customers.get(4086).getFax());
	}

	@Test
	@DisplayName("Record 4087: Email is paulette@abaloz.com")
	void EmailOfRecord4087() {
		assertEquals("paulette@abaloz.com", customers.get(4086).getEmail());
	}

	@Test
	@DisplayName("Record 4087: Web is http://www.pauletteabaloz.com")
	void WebOfRecord4087() {
		assertEquals("http://www.pauletteabaloz.com", customers.get(4086).getWeb());
	}
}
