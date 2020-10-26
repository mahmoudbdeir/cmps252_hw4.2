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

@Tag("26")
class Record_3180 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3180: FirstName is Jacklyn")
	void FirstNameOfRecord3180() {
		assertEquals("Jacklyn", customers.get(3179).getFirstName());
	}

	@Test
	@DisplayName("Record 3180: LastName is Lenhardt")
	void LastNameOfRecord3180() {
		assertEquals("Lenhardt", customers.get(3179).getLastName());
	}

	@Test
	@DisplayName("Record 3180: Company is Agricultural Research Svc Irri")
	void CompanyOfRecord3180() {
		assertEquals("Agricultural Research Svc Irri", customers.get(3179).getCompany());
	}

	@Test
	@DisplayName("Record 3180: Address is 909 Jonathon Dr")
	void AddressOfRecord3180() {
		assertEquals("909 Jonathon Dr", customers.get(3179).getAddress());
	}

	@Test
	@DisplayName("Record 3180: City is Madison")
	void CityOfRecord3180() {
		assertEquals("Madison", customers.get(3179).getCity());
	}

	@Test
	@DisplayName("Record 3180: County is Dane")
	void CountyOfRecord3180() {
		assertEquals("Dane", customers.get(3179).getCounty());
	}

	@Test
	@DisplayName("Record 3180: State is WI")
	void StateOfRecord3180() {
		assertEquals("WI", customers.get(3179).getState());
	}

	@Test
	@DisplayName("Record 3180: ZIP is 53713")
	void ZIPOfRecord3180() {
		assertEquals("53713", customers.get(3179).getZIP());
	}

	@Test
	@DisplayName("Record 3180: Phone is 608-271-6879")
	void PhoneOfRecord3180() {
		assertEquals("608-271-6879", customers.get(3179).getPhone());
	}

	@Test
	@DisplayName("Record 3180: Fax is 608-271-6527")
	void FaxOfRecord3180() {
		assertEquals("608-271-6527", customers.get(3179).getFax());
	}

	@Test
	@DisplayName("Record 3180: Email is jacklyn@lenhardt.com")
	void EmailOfRecord3180() {
		assertEquals("jacklyn@lenhardt.com", customers.get(3179).getEmail());
	}

	@Test
	@DisplayName("Record 3180: Web is http://www.jacklynlenhardt.com")
	void WebOfRecord3180() {
		assertEquals("http://www.jacklynlenhardt.com", customers.get(3179).getWeb());
	}
}
