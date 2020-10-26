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
class Record_3798 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3798: FirstName is Gertrude")
	void FirstNameOfRecord3798() {
		assertEquals("Gertrude", customers.get(3797).getFirstName());
	}

	@Test
	@DisplayName("Record 3798: LastName is Nelmes")
	void LastNameOfRecord3798() {
		assertEquals("Nelmes", customers.get(3797).getLastName());
	}

	@Test
	@DisplayName("Record 3798: Company is Paul, Myre D Esq")
	void CompanyOfRecord3798() {
		assertEquals("Paul, Myre D Esq", customers.get(3797).getCompany());
	}

	@Test
	@DisplayName("Record 3798: Address is 43 N Main St")
	void AddressOfRecord3798() {
		assertEquals("43 N Main St", customers.get(3797).getAddress());
	}

	@Test
	@DisplayName("Record 3798: City is Medford")
	void CityOfRecord3798() {
		assertEquals("Medford", customers.get(3797).getCity());
	}

	@Test
	@DisplayName("Record 3798: County is Burlington")
	void CountyOfRecord3798() {
		assertEquals("Burlington", customers.get(3797).getCounty());
	}

	@Test
	@DisplayName("Record 3798: State is NJ")
	void StateOfRecord3798() {
		assertEquals("NJ", customers.get(3797).getState());
	}

	@Test
	@DisplayName("Record 3798: ZIP is 8055")
	void ZIPOfRecord3798() {
		assertEquals("8055", customers.get(3797).getZIP());
	}

	@Test
	@DisplayName("Record 3798: Phone is 856-953-3663")
	void PhoneOfRecord3798() {
		assertEquals("856-953-3663", customers.get(3797).getPhone());
	}

	@Test
	@DisplayName("Record 3798: Fax is 856-953-4738")
	void FaxOfRecord3798() {
		assertEquals("856-953-4738", customers.get(3797).getFax());
	}

	@Test
	@DisplayName("Record 3798: Email is gertrude@nelmes.com")
	void EmailOfRecord3798() {
		assertEquals("gertrude@nelmes.com", customers.get(3797).getEmail());
	}

	@Test
	@DisplayName("Record 3798: Web is http://www.gertrudenelmes.com")
	void WebOfRecord3798() {
		assertEquals("http://www.gertrudenelmes.com", customers.get(3797).getWeb());
	}
}
