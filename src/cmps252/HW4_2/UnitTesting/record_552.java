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

@Tag("47")
class Record_552 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 552: FirstName is Maritsa")
	void FirstNameOfRecord552() {
		assertEquals("Maritsa", customers.get(551).getFirstName());
	}

	@Test
	@DisplayName("Record 552: LastName is Thyling")
	void LastNameOfRecord552() {
		assertEquals("Thyling", customers.get(551).getLastName());
	}

	@Test
	@DisplayName("Record 552: Company is Clement & Associates")
	void CompanyOfRecord552() {
		assertEquals("Clement & Associates", customers.get(551).getCompany());
	}

	@Test
	@DisplayName("Record 552: Address is 211 Grace Ln")
	void AddressOfRecord552() {
		assertEquals("211 Grace Ln", customers.get(551).getAddress());
	}

	@Test
	@DisplayName("Record 552: City is Lakeport")
	void CityOfRecord552() {
		assertEquals("Lakeport", customers.get(551).getCity());
	}

	@Test
	@DisplayName("Record 552: County is Lake")
	void CountyOfRecord552() {
		assertEquals("Lake", customers.get(551).getCounty());
	}

	@Test
	@DisplayName("Record 552: State is CA")
	void StateOfRecord552() {
		assertEquals("CA", customers.get(551).getState());
	}

	@Test
	@DisplayName("Record 552: ZIP is 95453")
	void ZIPOfRecord552() {
		assertEquals("95453", customers.get(551).getZIP());
	}

	@Test
	@DisplayName("Record 552: Phone is 707-263-7044")
	void PhoneOfRecord552() {
		assertEquals("707-263-7044", customers.get(551).getPhone());
	}

	@Test
	@DisplayName("Record 552: Fax is 707-263-3676")
	void FaxOfRecord552() {
		assertEquals("707-263-3676", customers.get(551).getFax());
	}

	@Test
	@DisplayName("Record 552: Email is maritsa@thyling.com")
	void EmailOfRecord552() {
		assertEquals("maritsa@thyling.com", customers.get(551).getEmail());
	}

	@Test
	@DisplayName("Record 552: Web is http://www.maritsathyling.com")
	void WebOfRecord552() {
		assertEquals("http://www.maritsathyling.com", customers.get(551).getWeb());
	}
}
