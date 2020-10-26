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

@Tag("18")
class Record_3691 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3691: FirstName is Patti")
	void FirstNameOfRecord3691() {
		assertEquals("Patti", customers.get(3690).getFirstName());
	}

	@Test
	@DisplayName("Record 3691: LastName is Boursiquot")
	void LastNameOfRecord3691() {
		assertEquals("Boursiquot", customers.get(3690).getLastName());
	}

	@Test
	@DisplayName("Record 3691: Company is Bush, Newland H Esq")
	void CompanyOfRecord3691() {
		assertEquals("Bush, Newland H Esq", customers.get(3690).getCompany());
	}

	@Test
	@DisplayName("Record 3691: Address is 121 Erie")
	void AddressOfRecord3691() {
		assertEquals("121 Erie", customers.get(3690).getAddress());
	}

	@Test
	@DisplayName("Record 3691: City is Paterson")
	void CityOfRecord3691() {
		assertEquals("Paterson", customers.get(3690).getCity());
	}

	@Test
	@DisplayName("Record 3691: County is Passaic")
	void CountyOfRecord3691() {
		assertEquals("Passaic", customers.get(3690).getCounty());
	}

	@Test
	@DisplayName("Record 3691: State is NJ")
	void StateOfRecord3691() {
		assertEquals("NJ", customers.get(3690).getState());
	}

	@Test
	@DisplayName("Record 3691: ZIP is 7524")
	void ZIPOfRecord3691() {
		assertEquals("7524", customers.get(3690).getZIP());
	}

	@Test
	@DisplayName("Record 3691: Phone is 973-684-7361")
	void PhoneOfRecord3691() {
		assertEquals("973-684-7361", customers.get(3690).getPhone());
	}

	@Test
	@DisplayName("Record 3691: Fax is 973-684-7006")
	void FaxOfRecord3691() {
		assertEquals("973-684-7006", customers.get(3690).getFax());
	}

	@Test
	@DisplayName("Record 3691: Email is patti@boursiquot.com")
	void EmailOfRecord3691() {
		assertEquals("patti@boursiquot.com", customers.get(3690).getEmail());
	}

	@Test
	@DisplayName("Record 3691: Web is http://www.pattiboursiquot.com")
	void WebOfRecord3691() {
		assertEquals("http://www.pattiboursiquot.com", customers.get(3690).getWeb());
	}
}
