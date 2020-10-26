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

@Tag("19")
class Record_1041 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1041: FirstName is Claudette")
	void FirstNameOfRecord1041() {
		assertEquals("Claudette", customers.get(1040).getFirstName());
	}

	@Test
	@DisplayName("Record 1041: LastName is Deblasi")
	void LastNameOfRecord1041() {
		assertEquals("Deblasi", customers.get(1040).getLastName());
	}

	@Test
	@DisplayName("Record 1041: Company is Herr & Low Pc")
	void CompanyOfRecord1041() {
		assertEquals("Herr & Low Pc", customers.get(1040).getCompany());
	}

	@Test
	@DisplayName("Record 1041: Address is Box #-487")
	void AddressOfRecord1041() {
		assertEquals("Box #-487", customers.get(1040).getAddress());
	}

	@Test
	@DisplayName("Record 1041: City is Hollister")
	void CityOfRecord1041() {
		assertEquals("Hollister", customers.get(1040).getCity());
	}

	@Test
	@DisplayName("Record 1041: County is Taney")
	void CountyOfRecord1041() {
		assertEquals("Taney", customers.get(1040).getCounty());
	}

	@Test
	@DisplayName("Record 1041: State is MO")
	void StateOfRecord1041() {
		assertEquals("MO", customers.get(1040).getState());
	}

	@Test
	@DisplayName("Record 1041: ZIP is 65672")
	void ZIPOfRecord1041() {
		assertEquals("65672", customers.get(1040).getZIP());
	}

	@Test
	@DisplayName("Record 1041: Phone is 417-334-6559")
	void PhoneOfRecord1041() {
		assertEquals("417-334-6559", customers.get(1040).getPhone());
	}

	@Test
	@DisplayName("Record 1041: Fax is 417-334-3992")
	void FaxOfRecord1041() {
		assertEquals("417-334-3992", customers.get(1040).getFax());
	}

	@Test
	@DisplayName("Record 1041: Email is claudette@deblasi.com")
	void EmailOfRecord1041() {
		assertEquals("claudette@deblasi.com", customers.get(1040).getEmail());
	}

	@Test
	@DisplayName("Record 1041: Web is http://www.claudettedeblasi.com")
	void WebOfRecord1041() {
		assertEquals("http://www.claudettedeblasi.com", customers.get(1040).getWeb());
	}
}
