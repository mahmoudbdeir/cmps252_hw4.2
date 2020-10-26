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

@Tag("38")
class Record_3992 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3992: FirstName is Broderick")
	void FirstNameOfRecord3992() {
		assertEquals("Broderick", customers.get(3991).getFirstName());
	}

	@Test
	@DisplayName("Record 3992: LastName is Danielle")
	void LastNameOfRecord3992() {
		assertEquals("Danielle", customers.get(3991).getLastName());
	}

	@Test
	@DisplayName("Record 3992: Company is Rotary Club Of S D")
	void CompanyOfRecord3992() {
		assertEquals("Rotary Club Of S D", customers.get(3991).getCompany());
	}

	@Test
	@DisplayName("Record 3992: Address is 130 Moonachie Ave")
	void AddressOfRecord3992() {
		assertEquals("130 Moonachie Ave", customers.get(3991).getAddress());
	}

	@Test
	@DisplayName("Record 3992: City is Carlstadt")
	void CityOfRecord3992() {
		assertEquals("Carlstadt", customers.get(3991).getCity());
	}

	@Test
	@DisplayName("Record 3992: County is Bergen")
	void CountyOfRecord3992() {
		assertEquals("Bergen", customers.get(3991).getCounty());
	}

	@Test
	@DisplayName("Record 3992: State is NJ")
	void StateOfRecord3992() {
		assertEquals("NJ", customers.get(3991).getState());
	}

	@Test
	@DisplayName("Record 3992: ZIP is 7072")
	void ZIPOfRecord3992() {
		assertEquals("7072", customers.get(3991).getZIP());
	}

	@Test
	@DisplayName("Record 3992: Phone is 201-939-6453")
	void PhoneOfRecord3992() {
		assertEquals("201-939-6453", customers.get(3991).getPhone());
	}

	@Test
	@DisplayName("Record 3992: Fax is 201-939-3911")
	void FaxOfRecord3992() {
		assertEquals("201-939-3911", customers.get(3991).getFax());
	}

	@Test
	@DisplayName("Record 3992: Email is broderick@danielle.com")
	void EmailOfRecord3992() {
		assertEquals("broderick@danielle.com", customers.get(3991).getEmail());
	}

	@Test
	@DisplayName("Record 3992: Web is http://www.broderickdanielle.com")
	void WebOfRecord3992() {
		assertEquals("http://www.broderickdanielle.com", customers.get(3991).getWeb());
	}
}
