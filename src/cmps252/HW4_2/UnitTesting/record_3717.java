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

@Tag("27")
class Record_3717 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3717: FirstName is Reed")
	void FirstNameOfRecord3717() {
		assertEquals("Reed", customers.get(3716).getFirstName());
	}

	@Test
	@DisplayName("Record 3717: LastName is Sipkema")
	void LastNameOfRecord3717() {
		assertEquals("Sipkema", customers.get(3716).getLastName());
	}

	@Test
	@DisplayName("Record 3717: Company is Girard, Victoria Esq")
	void CompanyOfRecord3717() {
		assertEquals("Girard, Victoria Esq", customers.get(3716).getCompany());
	}

	@Test
	@DisplayName("Record 3717: Address is 125 N Wynbach Ave  #-310")
	void AddressOfRecord3717() {
		assertEquals("125 N Wynbach Ave  #-310", customers.get(3716).getAddress());
	}

	@Test
	@DisplayName("Record 3717: City is Evansville")
	void CityOfRecord3717() {
		assertEquals("Evansville", customers.get(3716).getCity());
	}

	@Test
	@DisplayName("Record 3717: County is Vanderburgh")
	void CountyOfRecord3717() {
		assertEquals("Vanderburgh", customers.get(3716).getCounty());
	}

	@Test
	@DisplayName("Record 3717: State is IN")
	void StateOfRecord3717() {
		assertEquals("IN", customers.get(3716).getState());
	}

	@Test
	@DisplayName("Record 3717: ZIP is 47711")
	void ZIPOfRecord3717() {
		assertEquals("47711", customers.get(3716).getZIP());
	}

	@Test
	@DisplayName("Record 3717: Phone is 812-471-0300")
	void PhoneOfRecord3717() {
		assertEquals("812-471-0300", customers.get(3716).getPhone());
	}

	@Test
	@DisplayName("Record 3717: Fax is 812-471-6118")
	void FaxOfRecord3717() {
		assertEquals("812-471-6118", customers.get(3716).getFax());
	}

	@Test
	@DisplayName("Record 3717: Email is reed@sipkema.com")
	void EmailOfRecord3717() {
		assertEquals("reed@sipkema.com", customers.get(3716).getEmail());
	}

	@Test
	@DisplayName("Record 3717: Web is http://www.reedsipkema.com")
	void WebOfRecord3717() {
		assertEquals("http://www.reedsipkema.com", customers.get(3716).getWeb());
	}
}
