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

@Tag("10")
class Record_3251 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3251: FirstName is Milton")
	void FirstNameOfRecord3251() {
		assertEquals("Milton", customers.get(3250).getFirstName());
	}

	@Test
	@DisplayName("Record 3251: LastName is Rumph")
	void LastNameOfRecord3251() {
		assertEquals("Rumph", customers.get(3250).getLastName());
	}

	@Test
	@DisplayName("Record 3251: Company is Miller, Michael S Esq")
	void CompanyOfRecord3251() {
		assertEquals("Miller, Michael S Esq", customers.get(3250).getCompany());
	}

	@Test
	@DisplayName("Record 3251: Address is 201 Haynes St")
	void AddressOfRecord3251() {
		assertEquals("201 Haynes St", customers.get(3250).getAddress());
	}

	@Test
	@DisplayName("Record 3251: City is Cadillac")
	void CityOfRecord3251() {
		assertEquals("Cadillac", customers.get(3250).getCity());
	}

	@Test
	@DisplayName("Record 3251: County is Wexford")
	void CountyOfRecord3251() {
		assertEquals("Wexford", customers.get(3250).getCounty());
	}

	@Test
	@DisplayName("Record 3251: State is MI")
	void StateOfRecord3251() {
		assertEquals("MI", customers.get(3250).getState());
	}

	@Test
	@DisplayName("Record 3251: ZIP is 49601")
	void ZIPOfRecord3251() {
		assertEquals("49601", customers.get(3250).getZIP());
	}

	@Test
	@DisplayName("Record 3251: Phone is 231-779-7352")
	void PhoneOfRecord3251() {
		assertEquals("231-779-7352", customers.get(3250).getPhone());
	}

	@Test
	@DisplayName("Record 3251: Fax is 231-779-6303")
	void FaxOfRecord3251() {
		assertEquals("231-779-6303", customers.get(3250).getFax());
	}

	@Test
	@DisplayName("Record 3251: Email is milton@rumph.com")
	void EmailOfRecord3251() {
		assertEquals("milton@rumph.com", customers.get(3250).getEmail());
	}

	@Test
	@DisplayName("Record 3251: Web is http://www.miltonrumph.com")
	void WebOfRecord3251() {
		assertEquals("http://www.miltonrumph.com", customers.get(3250).getWeb());
	}
}
